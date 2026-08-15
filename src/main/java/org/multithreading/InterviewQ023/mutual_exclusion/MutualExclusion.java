package org.multithreading.InterviewQ023.mutual_exclusion;

public class MutualExclusion {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Thread thread1 = new Thread(()->bankAccount.withdraw(500),"Thread-A");
        Thread thread2 = new Thread(()->bankAccount.withdraw(500),"Thread-B");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
