package org.multithreading.InterviewQ014.wait_correction;

public class WaitCorrection {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" is working .");

        Object resource = new Object();

        SharedResource sharedResource = new SharedResource(resource);
        Thread thread1 = new Thread(sharedResource::work,"Thread-1");
        thread1.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (sharedResource){
            sharedResource.notify();
        }
        System.out.println(Thread.currentThread().getName()+" is finished.");
    }
}
