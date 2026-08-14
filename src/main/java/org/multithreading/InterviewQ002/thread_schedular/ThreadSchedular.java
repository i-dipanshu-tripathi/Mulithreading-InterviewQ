package org.multithreading.INTERVIEW.InterviewQ002.thread_schedular;

public class ThreadSchedular {
    public static void main(String[] args) {
        System.out.println("Thread working is : "+Thread.currentThread().getName());

        Thread threadA =  new CustomThread("ThreadA");
        Thread threadB =  new CustomThread("ThreadB");
        Thread threadC =  new CustomThread("ThreadC");

        threadA.start();
        threadB.start();
        threadC.start();

        try {
            threadA.join();
            threadB.join();
            threadC.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread working is : "+Thread.currentThread().getName());
    }
}
