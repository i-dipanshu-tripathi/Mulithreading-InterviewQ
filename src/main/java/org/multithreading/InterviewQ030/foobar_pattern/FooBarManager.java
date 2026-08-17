package org.multithreading.InterviewQ030.foobar_pattern;

public class FooBarManager {
    private int counter;
    private boolean turn;
    private int limit;

    public FooBarManager(int limit) {
        this.turn = true;
        this.limit = limit;
        this.counter = 0;
    }

    public synchronized void printFoo(String str) {
        while(counter < limit) {
            while(!turn){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            if(counter==limit){
                notify();
                break;
            }

            System.out.print(str);
            turn = false;
            notify();
        }

    }

    public synchronized void printBar(String str) {
        while(counter < limit) {
            while(turn){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            if(counter==limit){
                notify();
                break;
            }

            System.out.print(str);
            turn = true;
            counter++;
            notify();
        }
    }

}
