package org.multithreading.InterviewQ008.daemon_thread;

public class CustomThread extends Thread{

    public CustomThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        while (true) {

            System.out.println("Daemon Thread Running...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
