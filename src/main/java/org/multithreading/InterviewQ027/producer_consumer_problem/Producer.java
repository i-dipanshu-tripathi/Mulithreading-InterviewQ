package org.multithreading.InterviewQ027.producer_consumer_problem;

public class Producer extends Thread {
    private final SharedBuffer sharedBuffer;

    public Producer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            sharedBuffer.produce(i);
        }
    }

}
