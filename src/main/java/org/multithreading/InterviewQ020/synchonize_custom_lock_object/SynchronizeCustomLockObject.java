package org.multithreading.InterviewQ020.synchonize_custom_lock_object;

public class SynchronizeCustomLockObject {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread1 = new Thread(()->{
            for(int i=0;i<10;i++){
                counter.increment();
            }
        },"Thread-1");

        Thread thread2 = new Thread(()->{
            for(int i=0;i<10;i++){
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
