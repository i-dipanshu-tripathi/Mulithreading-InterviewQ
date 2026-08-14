package org.multithreading.InterviewQ001.creating_thread_using_thread.approach1;

public class CreatingThreadUsingThreadClass {
    public static void main(String[] args) {
        Thread customThread = new CustomThread();
        customThread.start();

        try {
            customThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
