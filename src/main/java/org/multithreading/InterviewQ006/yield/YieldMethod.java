package org.multithreading.InterviewQ006.yield;

public class YieldMethod {
    public static void main(String[] args) {
        CustomThread customThread1 = new CustomThread("Thread-A");
        CustomThread customThread2 = new CustomThread("Thread-B");
        CustomThread customThread3 = new CustomThread("Thread-C");

        customThread1.start();
        customThread2.start();
        customThread3.start();
    }
}
