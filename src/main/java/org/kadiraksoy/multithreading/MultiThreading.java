package org.kadiraksoy.multithreading;

public class MultiThreading {

    public static void main(String[] args) {

//        MultithreadingExtends  myThread = new MultithreadingExtends();
//        MultithreadingExtends  myThread2 = new MultithreadingExtends();
//        myThread.start();
//        myThread2.start();

        for(int i = 1; i <= 5; i++){
            MultithreadingExtends  myThread = new MultithreadingExtends(i);
            myThread.start();
        }

    }
}
