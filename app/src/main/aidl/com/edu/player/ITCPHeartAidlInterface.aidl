// ITCPHeartAidlInterface.aidl
package com.edu.player;

// Declare any non-default types here with import statements

interface ITCPHeartAidlInterface {

    String toActivity(int code, String msg);

    void toService(String ip, int port);

}
