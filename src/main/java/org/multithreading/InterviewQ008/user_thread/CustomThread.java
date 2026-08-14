package org.multithreading.InterviewQ008.user_thread;

public class CustomThread extends Thread{
    public CustomThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("User Thread Running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
