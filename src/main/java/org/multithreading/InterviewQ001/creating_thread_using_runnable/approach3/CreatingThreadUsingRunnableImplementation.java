package org.multithreading.INTERVIEW.InterviewQ001.creating_thread_using_runnable.runnable_implementation_approach;

public class CreatingThreadUsingRunnableImplementation {
    public static void main(String[] args) {
        /* starting of main-thread */
        System.out.println("Thread working is "+Thread.currentThread().getName());

        Runnable runnable = new CustomRunnable();

        Thread thread = new Thread(runnable);
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread finished is "+Thread.currentThread().getName());
    }
}
