package org.multithreading.InterviewQ016.synchonized_keyword;

public class Counter {
    private int counter = 0;

    public synchronized void increment(){
        counter++;
        System.out.println(Thread.currentThread().getName()+" -> "+counter);
    }
}
