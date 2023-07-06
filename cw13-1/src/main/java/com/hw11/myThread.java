package com.hw11;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;


public class myThread extends Thread{

    HashMap<Integer, String> sharedHashMap;

    public myThread(HashMap<Integer, String> sharedHashMap) {
        this.sharedHashMap = sharedHashMap;
    }



    @Override
    public void run(){

        for (int i = 0; i < 1000; i++) {
            sharedHashMap.put(i, "A");
            }
        }
    }

