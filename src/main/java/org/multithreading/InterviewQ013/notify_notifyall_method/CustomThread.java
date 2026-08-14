package org.multithreading.InterviewQ013.notify_notifyall_method;

public class CustomThread {
    private Object resource;

    public CustomThread(Object resource){
        this.resource = resource;
    }

    public  void checkNotify(){
        System.out.println(Thread.currentThread().getName()+" is working .");
        synchronized (resource){
            try {
                resource.wait();
                System.out.println(Thread.currentThread().getName()+" is finished .");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
