package org.multithreading.INTERVIEW.InterviewQ002.thread_schedular;

public class CustomThread extends Thread{
    public CustomThread(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
