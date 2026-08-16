package org.multithreading.InterviewQ027.producer_consumer_problem;

public class Consumer extends Thread{
    private final SharedBuffer sharedBuffer;

    public Consumer(SharedBuffer sharedBuffer){
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            sharedBuffer.consume();
        }

    }
}
