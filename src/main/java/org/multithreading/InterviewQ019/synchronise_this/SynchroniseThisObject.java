package org.multithreading.InterviewQ019.synchronise_this;

public class SynchroniseThisObject {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(()->{
            for(int i=0;i<10;i++){
                counter.increment();
            }
        },"Thread-1");

        Thread thread2 = new Thread(()->{
            for(int i=0;i<10;i++){
                counter.increment();
            }
        },"Thread-2");

        thread1.start();
        thread2.start();
    }
}
