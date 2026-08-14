package org.multithreading.InterviewQ001.creating_thread_using_thread.IFQ.IFQ5.practice;

public class CustomThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread running is : "+Thread.currentThread().getName());
    }
}
