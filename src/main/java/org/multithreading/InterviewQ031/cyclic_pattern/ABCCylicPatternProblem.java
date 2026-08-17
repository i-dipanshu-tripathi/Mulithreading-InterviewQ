package org.multithreading.InterviewQ031.cyclic_pattern;


public class ABCCylicPatternProblem {
    public static void main(String[] args) {
        ABCPattern remainderManager = new ABCPattern(2);

        Thread thread0 = new Thread(()->{
            while(remainderManager.printRemainder(0,"A"));
        },"Remainder-0");

        Thread thread1 = new Thread(()->{
            while(remainderManager.printRemainder(1,"B"));
        },"Remainder-1");

        Thread thread2 = new Thread(()->{
            while(remainderManager.printRemainder(2,"C"));
        },"Remainder-2");

        thread0.start();
        thread1.start();
        thread2.start();
    }
}