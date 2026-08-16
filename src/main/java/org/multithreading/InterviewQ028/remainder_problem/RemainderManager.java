package org.multithreading.InterviewQ028.remainder_problem;

public class RemainderManager {
    private int currNumber;
    private int limit;

    public RemainderManager(int currNumber, int limit) {
        this.currNumber = currNumber;
        this.limit = limit;
    }

    public synchronized boolean printRemainder(int number) {
        while (currNumber <= limit ) {
            while(currNumber%3!=number && currNumber <= limit){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            if(currNumber>limit){
                break;
            }

            System.out.println(Thread.currentThread().getName() + " currNumber : " + currNumber + " remainder : "+currNumber%3);
            currNumber++;
            notifyAll();
            return true;
        }
        return false;
    }
}