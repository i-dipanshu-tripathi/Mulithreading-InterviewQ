package org.multithreading.INTERVIEW.InterviewQ001.creating_thread_using_runnable.anonymous_approach;

public class CreatingThreadUsingRunnableAnonymousImplementation {
    public static void main(String[] args) {

        Runnable runnable = new Runnable(){
            @Override
            public void run(){
                System.out.println("Thread running is ..........."+Thread.currentThread().getName());
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
