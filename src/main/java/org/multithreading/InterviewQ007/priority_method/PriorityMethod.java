package org.multithreading.InterviewQ007.priority_method;

public class PriorityMethod {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new CustomThread("Thread-High"));
        Thread thread2 = new Thread(new CustomThread("Thread-Low"));
        Thread thread3 = new Thread(new CustomThread("Thread-Med"));

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread3.setPriority(Thread.NORM_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
