package org.multithreading.InterviewQ029.pattern_zero_even_odd;

public class PatternManager {
    private enum Turn {
        ZERO,
        ODD,
        EVEN
    }

    private Turn turn;
    private int currentNumber;
    private final int limit;

    public PatternManager(int start, int limit) {
        this.currentNumber = start;
        this.limit = limit;
        this.turn = Turn.ZERO;
    }

    public synchronized void printZero() {
        while (currentNumber <= limit) {
            while (turn != Turn.ZERO) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }

            if (currentNumber > limit) {
                notifyAll();
                return;
            }

            System.out.print(0 + " ");
            if (currentNumber % 2 == 0) {
                turn = Turn.EVEN;
            } else {
                turn = Turn.ODD;
            }
            notifyAll();
        }
        notifyAll();
    }

    public synchronized void printOdd() {
        while (currentNumber <= limit) {
            while (turn != Turn.ODD) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }

            if (currentNumber > limit) {
                notifyAll();
                return;
            }

            System.out.print(currentNumber + " ");
            currentNumber++;
            turn = Turn.ZERO;
            notifyAll();
        }
        notifyAll();
    }

    public synchronized void printEven() {
        while (currentNumber <= limit) {
            while (turn != Turn.EVEN) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }

            if (currentNumber > limit) {
                notifyAll();
                return;
            }

            System.out.print(currentNumber + " ");
            currentNumber++;
            turn = Turn.ZERO;
            notifyAll();
        }
        notifyAll();
    }
}
