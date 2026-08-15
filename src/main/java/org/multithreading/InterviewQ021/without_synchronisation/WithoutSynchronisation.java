package org.multithreading.InterviewQ021.without_synchronisation;

public class WithoutSynchronisation {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(()->{
            for(int i=0;i<10000;i++){
                counter.increment();
            }
        },"Thread-1");

        Thread thread2 = new Thread(()->{
            for(int i=0;i<10000;i++){
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

        System.out.println(counter.getCount());
    }
}
