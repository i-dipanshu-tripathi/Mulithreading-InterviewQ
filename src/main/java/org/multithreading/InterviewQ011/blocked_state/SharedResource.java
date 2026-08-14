package org.multithreading.InterviewQ011.blocked_state;

public class SharedResource {
    public synchronized void print(){
        System.out.println(Thread.currentThread().getName()+" acquired the lock .");

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName());
    }
}
