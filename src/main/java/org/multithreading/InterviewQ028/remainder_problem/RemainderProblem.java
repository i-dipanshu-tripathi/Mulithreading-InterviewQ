package org.multithreading.InterviewQ028.remainder_problem;

public class RemainderProblem {
    public static void main(String[] args) {
        RemainderManager remainderManager = new RemainderManager(5, 10);

        Thread thread0 = new Thread(()->{
            while(remainderManager.printRemainder(0));
        },"Remainder-0");

        Thread thread1 = new Thread(()->{
            while(remainderManager.printRemainder(1));
        },"Remainder-1");

        Thread thread2 = new Thread(()->{
            while(remainderManager.printRemainder(2));
        },"Remainder-2");

        thread0.start();
        thread1.start();
        thread2.start();
    }
}