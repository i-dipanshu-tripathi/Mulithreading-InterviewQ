package org.multithreading.InterviewQ008.daemon_thread;

public class DaemonThreads {
    public static void main(String[] args) {
        CustomThread customThread1 = new CustomThread("Thread-A");
        customThread1.setDaemon(true);
        System.out.println(customThread1.isDaemon());

        customThread1.start();
        try {
            customThread1.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread started");
    }
}
