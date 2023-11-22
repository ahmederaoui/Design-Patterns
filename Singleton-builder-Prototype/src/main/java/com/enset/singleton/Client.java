package com.enset.singleton;

public class Client {
    public static void main(String[] args) {
        Singleton singleton1=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
        System.out.println("Singleton 1 Name :"+singleton1.getPatternName());
        System.out.println("Singleton 2 Name :"+singleton2.getPatternName());
        System.out.println("--------------------------------------");
        singleton1.setSingleton("new Singleton");
        System.out.println("Singleton 1 Name :"+singleton1.getPatternName());
        System.out.println("Singleton 2 Name :"+singleton2.getPatternName());
    }
}
