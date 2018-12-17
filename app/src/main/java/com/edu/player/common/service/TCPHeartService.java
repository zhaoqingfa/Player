package com.edu.player.common.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;

import com.edu.player.ITCPHeartAidlInterface;
import com.edu.player.common.log.LogUtil;
import com.edu.player.net.socket.SocketClient;
import com.edu.player.util.Config;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * Created by v_zhaoqingfa on 2018/12/17.
 */

public class TCPHeartService extends Service{

    private static final long HEART_TIME = 1 * 1000;

    private String mIp;
    private int mPort;
    private SocketClient mSocketClient;

    private Handler mHandler;
    private Runnable mRunnable;

    private long sendTime = 0L;

    private IBinder mIBinder = new ITCPHeartAidlInterface.Stub() {
        @Override
        public String toActivity(int code, String msg) throws RemoteException {
            return "";
        }

        @Override
        public void toService(String ip, int port) throws RemoteException {
            mIp = ip;
            mPort = port;
        }
    };

    private SocketClient.SocketEventListener listener = new SocketClient.SocketEventListener() {
        @Override
        public void onDataReceived(byte[] data, short capacity) {
            LogUtil.d("TCPHeartService read success ==>" + Arrays.toString(data));
        }

        @Override
        public void onConnected(short result, Exception e) {
            if (SocketClient.SUCCESS == result) {
                if (mHandler != null && mRunnable != null) {
                    mHandler.postDelayed(mRunnable, 0);
                }
            }
        }

        @Override
        public void onDisconnected(short result, Exception e) {

        }

        @Override
        public void onDataDelivered(short result, Object e) {
            if (SocketClient.SUCCESS == result) {
                sendTime = System.currentTimeMillis();
                LogUtil.d("TCPHeartService write success ==>" + Arrays.toString(((ByteBuffer) e).array()));
            }
        }
    };

    @Override
    public void onCreate() {
        super.onCreate();
        initSocket();
        mHandler = new Handler();
        mRunnable = new Runnable() {
            @Override
            public void run() {
                mSocketClient.send(ByteBuffer.wrap(new byte[]{1}));
                mHandler.postDelayed(mRunnable, HEART_TIME);
            }
        };
    }

    private void initSocket() {
        mIp = TextUtils.isEmpty(mIp) ? Config.DEFAULT_IP : mIp;
        mPort = mPort == 0 ? Config.DEFAULT_PORT : mPort;
        mSocketClient = new SocketClient(mIp, mPort);
        mSocketClient.setSocketEventListener(listener);
        mSocketClient.connect();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mIBinder;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        LogUtil.d("TCPHeartService onDestroy");
        if (mHandler != null && mRunnable != null) {
            mHandler.removeCallbacks(mRunnable);
        }
        if (mSocketClient != null) {
            mSocketClient.setSocketEventListener(null);
        }
        mSocketClient.close();
    }
}
