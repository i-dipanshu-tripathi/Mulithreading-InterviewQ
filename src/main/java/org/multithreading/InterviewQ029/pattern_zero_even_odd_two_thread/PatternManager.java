package org.multithreading.InterviewQ029.pattern_zero_even_odd_two_thread;

public class PatternManager {
    public static void main(String []args){
        SharedResource sharedResource = new SharedResource(1,20);

        Runnable zeroRunnable = ()->{
            try {
                sharedResource.printZero();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        };

        Runnable evenOddRunnable = ()->{
            try {
                sharedResource.printEvenOdd();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        };

        Thread zeroThread = new Thread(zeroRunnable,"Zero-Thread");
        Thread evenOddThread = new Thread(evenOddRunnable,"Even-Odd-Thread");

        zeroThread.start();
        evenOddThread.start();

    }
}
