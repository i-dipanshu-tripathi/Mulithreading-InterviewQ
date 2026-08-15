package org.multithreading.InterviewQ021.without_synchronisation;

public class Counter {
    private int count = 0;
    public void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
