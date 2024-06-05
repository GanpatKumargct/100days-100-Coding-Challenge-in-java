package com.Ganpat.Challenge99;

public class HelloThreads extends Thread{
    private final int threadnumber;


    public HelloThreads(int threadnumber) {
        this.threadnumber = threadnumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            System.out.printf("%d Hello from Thread name - %s\n",threadnumber,Thread.currentThread().getName());
        }
    }
}














