package org.multithreading.InterviewQ010.wait_method;

public class WaitThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" is working.");

        Object lock = new Object();
        CustomThread customThread = new CustomThread(lock);

        customThread.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(customThread.getState());

        synchronized (lock){
            lock.notify();
        }

        System.out.println(Thread.currentThread().getName()+" is working thread.");
    }
}
