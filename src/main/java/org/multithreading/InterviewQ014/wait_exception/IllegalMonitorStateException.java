package org.multithreading.InterviewQ014.wait_exception;

public class IllegalMonitorStateException {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" is working .");

        SharedResource sharedResource = new SharedResource();
        sharedResource.work();
    }
}
