package org.multithreading.InterviewQ004.approach_withoutjoin;

public class CustomThread extends Thread{
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
