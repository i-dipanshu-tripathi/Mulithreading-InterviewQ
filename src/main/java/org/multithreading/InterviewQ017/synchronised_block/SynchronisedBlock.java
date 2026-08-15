package org.multithreading.InterviewQ017.synchronised_block;

public class SynchronisedBlock {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName()+" is started.");
        Counter counter = new Counter();

        Thread thread1 = new Thread(()->{
            for(int i=0;i<3;i++){
                counter.increment();
            }
        },"thread-1");

        Thread thread2 = new  Thread(()->{
            for(int i=0;i<3;i++){
                counter.increment();
            }
        },"thread-2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName()+" is finished.");
    }
}
