package com.enset.proxy;

public class Proxy implements Abstraction {
    private Implementation implementation;
    @Override
    public void operation() {

        System.out.println("some operations Before");
        implementation=new Implementation();
        System.out.println("some operation after");
    }
}
