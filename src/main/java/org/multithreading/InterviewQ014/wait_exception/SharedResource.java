package org.multithreading.InterviewQ014.wait_exception;

public class SharedResource {
    public void work(){
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
