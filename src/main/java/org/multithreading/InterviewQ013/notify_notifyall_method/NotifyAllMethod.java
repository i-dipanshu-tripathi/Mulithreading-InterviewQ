package org.multithreading.InterviewQ013.notify_notifyall_method;

public class NotifyAllMethod {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" is working.");
        Object resource = new Object();

        CustomThread customThread = new CustomThread(resource);
        Thread thread1 = new Thread(customThread::checkNotify,"Thread-1");
        Thread thread2 = new Thread(customThread::checkNotify,"Thread-2");
        Thread thread3 = new Thread(customThread::checkNotify,"Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (resource){
            resource.notifyAll();
        }
        System.out.println(Thread.currentThread().getName()+" is finished.");
    }
}
