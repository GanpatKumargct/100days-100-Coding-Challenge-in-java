package com.Ganpat.Challenge101;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        FirstThreads f1 = new FirstThreads(1);
        FirstThreads f2 = new FirstThreads(2);
        FirstThreads f3 = new FirstThreads(3);


        f1.start();
        f1.join();

        f2.start();
        f2.join();

        f3.start();
//        f3.join();

    }
}
