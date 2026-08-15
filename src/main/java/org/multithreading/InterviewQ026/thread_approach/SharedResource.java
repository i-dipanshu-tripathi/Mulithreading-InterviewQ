package org.multithreading.InterviewQ026.thread_approach;

public class SharedResource {
    private int number;
    private final int limit;

    public SharedResource(int number,int limit){
        this.number=number;
        this.limit=limit;
    }

    public synchronized void printEven(){
        while(number<=limit){
            while(number%2!=0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            if(number>limit){
                break;
            }

            System.out.println(Thread.currentThread().getName()+":"+number);
            number++;
            notify();
        }
    }

    public synchronized void printOdd(){
        while(number<=limit){
            while(number%2==0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            if(number>limit){
                break;
            }
            System.out.println(Thread.currentThread().getName()+":"+number);
            number++;
            notify();
        }
    }
}
