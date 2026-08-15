package org.multithreading.InterviewQ018.synchronised_diffobject;

public class Service {
    private final Object customerLock = new Object();
    private final Object loanLock = new Object();

    public void updateCustomer(){
        synchronized (customerLock){
            System.out.println(Thread.currentThread().getName()+" Updating Customer ..");

            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

            System.out.println(Thread.currentThread().getName()+" Updating Customer done");
        }
    }

    public void updateLoan(){
        synchronized (loanLock){
            System.out.println(Thread.currentThread().getName()+" Updating Loan ..");
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println(Thread.currentThread().getName()+" Updating Loan done");
        }
    }
}
