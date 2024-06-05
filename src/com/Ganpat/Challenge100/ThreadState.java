package com.Ganpat.Challenge100;

public class ThreadState extends Thread{



    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.printf("From inside Run %s ",Thread.currentThread().getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
