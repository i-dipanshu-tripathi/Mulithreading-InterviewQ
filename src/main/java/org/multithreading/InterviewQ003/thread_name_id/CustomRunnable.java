package org.multithreading.InterviewQ003.thread_name_id;

public class CustomRunnable implements Runnable{
    @Override
    public void run(){
        Thread currentThread = Thread.currentThread();

        System.out.println(currentThread);
        System.out.println("Current Thread Name is : "+currentThread.getName());
        System.out.println("Current Thread ID is : "+currentThread.getId());
    }
}
