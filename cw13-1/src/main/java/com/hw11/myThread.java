package com.hw11;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;


public class myThread extends Thread{

    ConcurrentHashMap<Integer, String> sharedHashMap;

    public myThread(ConcurrentHashMap<Integer, String> sharedHashMap) {
        this.sharedHashMap = sharedHashMap;
    }



    @Override
    public void run(){

        for (int i = 0; i < 1000; i++) {
            sharedHashMap.put(i, "A");
            }
        }
    }

