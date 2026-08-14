package org.multithreading.InterviewQ010.wait_method;

public class CustomThread extends Thread{
    private final Object lock;

    public CustomThread(Object lock){
        this.lock = lock;
    }

    @Override
    public void run(){
        synchronized (lock){
            try {
                System.out.println("Child Thread waiting.....");
                lock.wait();
                System.out.println("Child Thread resumed");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
