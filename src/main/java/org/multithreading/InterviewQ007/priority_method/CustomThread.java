package org.multithreading.InterviewQ007.priority_method;

public class CustomThread extends Thread{
    public CustomThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
        }
    }
}
