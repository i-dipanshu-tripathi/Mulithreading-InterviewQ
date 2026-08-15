package org.multithreading.InterviewQ026.thread_approach;

public class AlterenateEvenOddPrint {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource(1,10);
        Thread thread1 = new EvenThread(sharedResource);
        Thread thread2 = new OddThread(sharedResource);

        thread1.setName("Even-Thread");
        thread2.setName("Odd-Thread");

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
