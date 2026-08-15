package org.multithreading.InterviewQ023.mutual_exclusion;

public class BankAccount {
    private int balance = 1000;
    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" entered .");

        if(balance>=amount){
            try{
                Thread.sleep(5000);
            }catch(Exception e){
                e.printStackTrace();
            }

            balance -= amount;
            System.out.println(Thread.currentThread().getName()+" withdraw amount "+amount);
        }

        System.out.println(Thread.currentThread().getName()+" leaving.");
    }
}
