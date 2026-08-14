package org.multithreading.InterviewQ005.sleep;

public class SleepMethod {
    public static void main(String[] args) {
        System.out.println("Thread working is : "+Thread.currentThread().getName());

        Thread thread = new CustomThread();
        thread.start();

        System.out.println("Thread finished is : "+Thread.currentThread().getName());
    }
}