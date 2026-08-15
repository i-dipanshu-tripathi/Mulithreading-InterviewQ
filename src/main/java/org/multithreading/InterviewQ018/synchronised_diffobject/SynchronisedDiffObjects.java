package org.multithreading.InterviewQ018.synchronised_diffobject;

public class SynchronisedDiffObjects {
    public static void main(String[] args) {
        Service service = new Service();
        Thread thread1 = new Thread(service::updateCustomer,"Thread-1");
        Thread thread2 = new Thread(service::updateLoan,"Thread-2");

        thread1.start();
        thread2.start();
    }
}
