package org.multithreading.InterviewQ020.synchonize_custom_lock_object;

public class Counter {
    private int count = 0;

    private final Object lock = new Object();

    public void increment(){
        synchronized (lock){
            count++;
            System.out.println(Thread.currentThread().getName() + ": " + count);
        }
    }
}
