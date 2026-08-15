package org.multithreading.InterviewQ016.synchonized_keyword;

public class SynchonizedMethod {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName()+" is working.");
        Counter counter = new Counter();

        Thread thread1 = new Thread(()->{
            for(int i=0;i<5;i++){
                counter.increment();
            }
        },"Thread-1");

        Thread thread2 = new Thread(()->{
            for(int i=0;i<5;i++){
                counter.increment();
            }
        },"Thread-2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
