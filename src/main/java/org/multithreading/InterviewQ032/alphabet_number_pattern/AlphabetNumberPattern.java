package org.multithreading.InterviewQ032.alphabet_number_pattern;

public class AlphabetNumberPattern {
    public static void main(String[] args) {
        AlphabetNumber alphabetNumber = new AlphabetNumber(3);

        Thread alphabetThread = new Thread(()->{
            alphabetNumber.printAlphabet();
        },"Alphabet Thread");

        Thread numberThread = new Thread(()->{
            alphabetNumber.printNumber();
        },"Number Thread");

        alphabetThread.start();
        numberThread.start();
    }
}
