package com.edu.player.net.http.down;

/**
 * Created by zqf on 2018/11/25.
 */

public class DownInfo {
//    /*存储位置*/
//    private String savePath;
//    /*文件总长度*/
//    private long countLength;
//    /*下载长度*/
//    private long readLength;
//    /*超时设置*/
//    private  int connectTimeout;
//    /*state状态数据库保存*/
//    private int stateInte;
//    /*url*/
//    private String url;
//    /*是否需要实时更新下载进度,避免线程的多次切换*/
//    private boolean updateProgress;
//
//    public DownInfo(String url,HttpDownOnNextListener listener) {
//        setUrl(url);
//        setListener(listener);
//    }
//
//    public DownInfo(String url) {
//        setUrl(url);
//    }
//
//    @Keep
//    public DownInfo(long id, String savePath, long countLength, long readLength,
//                    int connectonTime, int stateInte, String url) {
//        this.id = id;
//        this.savePath = savePath;
//        this.countLength = countLength;
//        this.readLength = readLength;
//        this.connectonTime = connectonTime;
//        this.stateInte = stateInte;
//        this.url = url;
//    }
//
//    @Keep
//    public DownInfo() {
//        readLength=0l;
//        countLength=0l;
//        stateInte=DownState.START.getState();
//    }
//
//    @Generated(hash = 1860227052)
//    public DownInfo(long id, String savePath, long countLength, long readLength,
//                    int connectonTime, int stateInte, String url, boolean updateProgress) {
//        this.id = id;
//        this.savePath = savePath;
//        this.countLength = countLength;
//        this.readLength = readLength;
//        this.connectonTime = connectonTime;
//        this.stateInte = stateInte;
//        this.url = url;
//        this.updateProgress = updateProgress;
//    }
//
//    public DownState getState() {
//        switch (getStateInte()){
//            case 0:
//                return DownState.START;
//            case 1:
//                return DownState.DOWN;
//            case 2:
//                return DownState.PAUSE;
//            case 3:
//                return DownState.STOP;
//            case 4:
//                return DownState.ERROR;
//            case 5:
//            default:
//                return DownState.FINISH;
//        }
//    }
//
//    public boolean isUpdateProgress() {
//        return updateProgress;
//    }
//
//    public void setUpdateProgress(boolean updateProgress) {
//        this.updateProgress = updateProgress;
//    }
//
//    public void setState(DownState state) {
//        setStateInte(state.getState());
//    }
//
//
//    public int getStateInte() {
//        return stateInte;
//    }
//
//    public void setStateInte(int stateInte) {
//        this.stateInte = stateInte;
//    }
//
//    public HttpDownOnNextListener getListener() {
//        return listener;
//    }
//
//    public void setListener(HttpDownOnNextListener listener) {
//        this.listener = listener;
//    }
//
//    public HttpDownService getService() {
//        return service;
//    }
//
//    public void setService(HttpDownService service) {
//        this.service = service;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public String getSavePath() {
//        return savePath;
//    }
//
//    public void setSavePath(String savePath) {
//        this.savePath = savePath;
//    }
//
//
//    public long getCountLength() {
//        return countLength;
//    }
//
//    public void setCountLength(long countLength) {
//        this.countLength = countLength;
//    }
//
//
//    public long getReadLength() {
//        return readLength;
//    }
//
//    public void setReadLength(long readLength) {
//        this.readLength = readLength;
//    }
//
//    public long getId() {
//        return this.id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public int getConnectonTime() {
//        return this.connectonTime;
//    }
//
//    public void setConnectonTime(int connectonTime) {
//        this.connectonTime = connectonTime;
//    }
//
//    public boolean getUpdateProgress() {
//        return this.updateProgress;
//    }
}
