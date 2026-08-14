package org.multithreading.InterviewQ009.thread_state;

public class ThreadState {
    public static void main(String[] args) {
        CustomThread customThread = new CustomThread();
        System.out.println(customThread.getState()+" is thread state");

        customThread.start();
        System.out.println(customThread.getState()+" is thread state");

        try {
            customThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(customThread.getState()+" is thread state");
    }
}
