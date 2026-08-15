package org.multithreading.InterviewQ022.with_synchronisation;

public class Counter {
    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
