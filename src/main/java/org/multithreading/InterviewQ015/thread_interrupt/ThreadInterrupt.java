package org.multithreading.InterviewQ015.thread_interrupt;

public class ThreadInterrupt {
    public static void main(String[] args) {
        CustomThread customThread = new CustomThread();
        customThread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        customThread.interrupt();
    }
}
