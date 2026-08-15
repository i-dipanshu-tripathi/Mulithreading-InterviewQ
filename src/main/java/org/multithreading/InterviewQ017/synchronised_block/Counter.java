package org.multithreading.InterviewQ017.synchronised_block;

public class Counter {
    private int count = 0;

    public void increment(){
        System.out.println(Thread.currentThread().getName()+" Doing some work .");

        synchronized (this) {
            count++;
            System.out.println(Thread.currentThread().getName()+" Count : "+count);
            System.out.println(Thread.currentThread().getName()+" is Finished .");
        }


    }
}
