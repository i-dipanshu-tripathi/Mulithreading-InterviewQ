package org.multithreading.InterviewQ009.thread_state;

public class CustomThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is running");
    }
}
