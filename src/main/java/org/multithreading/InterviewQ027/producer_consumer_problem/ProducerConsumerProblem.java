package org.multithreading.InterviewQ027.producer_consumer_problem;

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer(5);
        Thread consumerThread = new Consumer(sharedBuffer);
        Thread producerThread = new Producer(sharedBuffer);

        consumerThread.setName("consumerThread");
        producerThread.setName("producerThread");

        consumerThread.start();
        producerThread.start();

    }
}
