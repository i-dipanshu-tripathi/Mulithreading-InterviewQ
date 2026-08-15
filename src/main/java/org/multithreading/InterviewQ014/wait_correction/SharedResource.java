package org.multithreading.InterviewQ014.wait_correction;

public class SharedResource {
    private Object resource;

    public SharedResource(Object resource){
        this.resource = resource;
    }

    public synchronized void work(){
        try {
            System.out.println(Thread.currentThread().getName()+" is working .");
            wait();
            System.out.println(Thread.currentThread().getName()+" is finished .");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
