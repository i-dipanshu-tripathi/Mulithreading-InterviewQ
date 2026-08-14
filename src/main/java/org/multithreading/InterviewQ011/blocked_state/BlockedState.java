package org.multithreading.InterviewQ011.blocked_state;

public class BlockedState {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread t1 = new Thread(sharedResource::print,"Thread-A");
        Thread t2 = new Thread(sharedResource::print,"Thread-B");

        t1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t2.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(t2.getState());
    }
}
