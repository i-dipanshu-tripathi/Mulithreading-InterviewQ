package org.multithreading.InterviewQ015.thread_interrupt;

public class CustomThread extends Thread{
    @Override
    public void run(){
        try {
            System.out.println("Thread Sleeping ....");
            Thread.sleep(10000);
            System.out.println("Thread Woke Up Normally");
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted!");
        }
    }
}
