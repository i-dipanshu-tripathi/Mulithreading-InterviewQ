package org.multithreading.InterviewQ030.foobar_pattern;

public class FooBarPrinter {
    public static void main(String[] args) {
        FooBarManager fooBarManager = new FooBarManager(5);
        Thread threadFoo = new Thread(()->{
            fooBarManager.printFoo("foo");
        });

        Thread threadBar = new Thread(()->{
            fooBarManager.printBar("bar");
        });

        threadFoo.start();
        threadBar.start();
    }
}
