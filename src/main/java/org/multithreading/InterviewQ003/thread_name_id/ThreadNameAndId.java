package org.multithreading.INTERVIEW.InterviewQ003.thread_name_id;

public class ThreadNameAndId {
    public static void main(String[] args) {
        System.out.println("Thread working is : "+Thread.currentThread().getName());

        Thread thread1 = new Thread(new CustomRunnable(),"Payment-Thread");
        Thread thread2 = new Thread(new CustomRunnable(),"Email-Thread");

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
