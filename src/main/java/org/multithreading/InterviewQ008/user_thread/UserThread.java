package org.multithreading.InterviewQ008.user_thread;


public class UserThread{
    public static void main(String[] args) {
        CustomThread customThread1 = new CustomThread("Thread-A");

        customThread1.start();
        try {
            customThread1.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread started");
    }
}
