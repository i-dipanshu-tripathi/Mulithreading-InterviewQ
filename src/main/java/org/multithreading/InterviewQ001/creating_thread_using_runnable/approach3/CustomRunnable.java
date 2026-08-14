package org.multithreading.INTERVIEW.InterviewQ001.creating_thread_using_runnable.runnable_implementation_approach;

public class CustomRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is working...");
    }
}

