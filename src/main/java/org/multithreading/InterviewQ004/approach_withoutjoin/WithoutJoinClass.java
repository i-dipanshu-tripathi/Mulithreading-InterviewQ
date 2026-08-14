package org.multithreading.InterviewQ004.approach_withoutjoin;

public class WithoutJoinClass {
    public static void main(String[] args) {
        System.out.println("Thread started is : "+Thread.currentThread().getName());

        Thread thread1 = new CustomThread();
        Thread thread2 = new CustomThread();

        thread1.start();
        thread2.start();


        System.out.println("Thread finished is : "+Thread.currentThread().getName());
    }
}
