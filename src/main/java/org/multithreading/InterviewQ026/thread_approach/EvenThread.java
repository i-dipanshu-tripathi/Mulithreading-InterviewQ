package org.multithreading.InterviewQ026.thread_approach;

public class EvenThread extends Thread{
    SharedResource sharedResource;

    public EvenThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        sharedResource.printEven();
    }
}
