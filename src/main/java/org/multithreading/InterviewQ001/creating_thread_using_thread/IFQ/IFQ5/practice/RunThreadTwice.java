package org.multithreading.InterviewQ001.creating_thread_using_thread.IFQ.IFQ5.practice;

public class RunThreadTwice  extends Thread{
    public static void main(String[] args) {
        CustomThread customThread = new CustomThread();
        customThread.start();
        customThread.start();
    }
}
