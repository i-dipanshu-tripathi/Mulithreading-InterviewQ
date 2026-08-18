package org.multithreading.InterviewQ032.alphabet_number_pattern;

public class AlphabetNumber {
    private boolean turn ;
    private int number;
    private int repetitions;

    public AlphabetNumber(int repetitions) {
        this.turn = true;
        this.number = 1;
        this.repetitions = repetitions;
    }

    public synchronized void printAlphabet(){
        while(number<=repetitions){
            while(!turn){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            if(number>repetitions){
                notify();
                break;
            }

            char ch = (char)(number-1+'A');
            System.out.print(ch);
            turn = !turn;
            notify();
        }
    }

    public synchronized void printNumber(){
        while(number<=repetitions){
            while(turn){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            if(number>repetitions){
                notify();
                break;
            }
            System.out.print(number);
            number = number + 1;
            turn = !turn;
            notify();
        }
    }
}
