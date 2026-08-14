package org.multithreading.InterviewQ006.yield;

public class CustomThread extends  Thread{
    public CustomThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
            Thread.yield();
        }
    }
}
