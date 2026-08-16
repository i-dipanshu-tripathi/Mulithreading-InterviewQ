package org.multithreading.InterviewQ029.pattern_zero_even_odd_two_thread;

public class SharedResource {
    private boolean zeroFlag;
    private int currNumber;
    private final int limit;

    public SharedResource(int currNumber ,int limit){
        zeroFlag = true;
        this.currNumber = currNumber;
        this.limit = limit;
    }

    public synchronized void printZero() throws InterruptedException{
        while(currNumber<=limit){
            while(!zeroFlag){
                wait();
            }

            if(currNumber>limit)break;

            System.out.println(Thread.currentThread().getName()+" : "+0);
            zeroFlag = !zeroFlag;
            notifyAll();
        }

    }

    public synchronized void printEvenOdd() throws InterruptedException{
        while(currNumber<=limit){
            while(zeroFlag){
                wait();
            }

            if(currNumber>limit)break;

            System.out.println(Thread.currentThread().getName()+" : "+currNumber);
            zeroFlag = !zeroFlag;
            currNumber++;
            notifyAll();
        }
    }
}
