package org.multithreading.INTERVIEW.InterviewQ001.creating_thread_using_runnable.lambda_approach;

public class CreatingThreadUsingRunnableLambdaExpression {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("Thread running is ......."+Thread.currentThread().getName());
        });
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
