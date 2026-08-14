package org.multithreading.InterviewQ004.approach_withjoin;

public class WithJoinClass {
    public static void main(String[] args) {
        System.out.println("Thread started is : "+Thread.currentThread().getName());

        Thread thread1 = new CustomThread();
        Thread thread2 = new CustomThread();

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread finished is : "+Thread.currentThread().getName());

    }
}
