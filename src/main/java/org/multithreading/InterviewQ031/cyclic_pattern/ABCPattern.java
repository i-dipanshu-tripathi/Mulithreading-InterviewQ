package org.multithreading.InterviewQ031.cyclic_pattern;

public class ABCPattern {
    private int turn;
    private int completedCycles ;
    private int repetitions;

    public ABCPattern(int repetitions) {
        this.turn = 0;
        this.completedCycles = 0;
        this.repetitions = repetitions;
    }

    public synchronized boolean printRemainder(int number,String ch) {
        while (completedCycles < repetitions ) {
            while(turn !=number &&  completedCycles< repetitions ){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            if(completedCycles>=repetitions){
                notifyAll();
                break;
            }

            System.out.print(ch);

            turn = (turn+1)%3;

            if(turn%3==0){
                completedCycles++;
            }


            notifyAll();
            return true;
        }
        return false;
    }
}