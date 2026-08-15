package org.multithreading.InterviewQ019.synchronise_this;

public class Counter {

    private int count = 0;

    public void increment(){
        synchronized (this) {
            count++;
            System.out.println(Thread.currentThread().getName() + ": " + count);
        }
    }
}
