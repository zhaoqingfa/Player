package com.edu.player;

import android.app.Application;
import android.content.Context;

import com.edu.player.common.log.LogUtil;
import com.edu.player.util.SystemUtil;

/**
 * Created by zqf on 2018/11/23.
 */

public class MainApplication extends Application {
    private Context context;
    private static MainApplication mInstance;

    private boolean isDebug = false;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        mInstance = this;
        isDebug = SystemUtil.isApkInDebug(context);
        LogUtil.init(isDebug);
    }

    public static MainApplication getInstance() {
        return mInstance;
    }

    public Context getContext() {
        return context;
    }

    public boolean isDebug() {
        return isDebug;
    }
}
