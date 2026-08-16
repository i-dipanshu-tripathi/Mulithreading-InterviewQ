package org.multithreading.InterviewQ027.producer_consumer_problem;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
    private final Queue buffer;
    private final int capacity;

    public SharedBuffer(int capacity) {
        this.buffer = new LinkedList<>();
        this.capacity = capacity;
    }


    public synchronized Object consume(){
        while(buffer.isEmpty()){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Object poll = buffer.poll();
        System.out.println(Thread.currentThread().getName() + " consumed " + poll + " | Buffer : " + buffer);
        notifyAll();
        return  poll;
    }

    public synchronized void produce(int itemProduced){
        while(buffer.size()==capacity){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        buffer.offer(itemProduced);
        System.out.println(Thread.currentThread().getName() + " produced " + itemProduced + " | Buffer : " + buffer);
        notifyAll();
    }
}
