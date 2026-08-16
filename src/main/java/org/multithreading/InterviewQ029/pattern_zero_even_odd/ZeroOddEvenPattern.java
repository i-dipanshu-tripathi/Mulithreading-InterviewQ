package org.multithreading.InterviewQ029.pattern_zero_even_odd;

public class ZeroOddEvenPattern {
    public static void main(String[] args) {
        PatternManager printer = new PatternManager(1, 10);

        Thread zeroThread = new Thread(printer::printZero, "Zero");
        Thread oddThread = new Thread(printer::printOdd, "Odd");
        Thread evenThread = new Thread(printer::printEven, "Even");

        zeroThread.start();
        oddThread.start();
        evenThread.start();

        try {
            zeroThread.join();
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
