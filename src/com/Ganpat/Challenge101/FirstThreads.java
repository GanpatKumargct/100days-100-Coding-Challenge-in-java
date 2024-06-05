package com.Ganpat.Challenge101;

public class FirstThreads extends Thread{

    private final int threadnumber;

    public FirstThreads(int threadnumber) {
        this.threadnumber = threadnumber;
    }


    @Override
    public void run() {

        System.out.printf("%d Starting Thread name - %s\n",threadnumber,Thread.currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%d Ending Thread name - %s\n",threadnumber,Thread.currentThread().getName());

    }
}
