package com.enset.proxy;

public class Client {
    public static void main(String[] args) {
        Abstraction abstraction=new Proxy();
        abstraction.operation();
    }
}
