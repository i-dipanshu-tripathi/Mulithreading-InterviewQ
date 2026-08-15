package org.multithreading.InterviewQ026.thread_approach;

public class OddThread extends Thread {
    private SharedResource sharedResource;

    public OddThread(SharedResource sharedResource) {
        this.sharedResource=sharedResource;
    }

    @Override
    public void run() {
        sharedResource.printOdd();
    }

}
