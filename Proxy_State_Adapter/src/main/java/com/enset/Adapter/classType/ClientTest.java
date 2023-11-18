package com.enset.Adapter.classType;

public class ClientTest {
    public static void main(String[] args) {
        Strandard standard=new StrandardImpl();
        standard.operation();
        System.out.println("---------------------------------------");
        standard=new adapter();
        standard.operation();
        System.out.println("---------------------------------------");
    }
}
