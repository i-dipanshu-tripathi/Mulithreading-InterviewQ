package org.multithreading.InterviewQ001.creating_thread_using_thread.approach1;

public class CustomThread extends Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(1000);
            System.out.println("Thread working is : "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
