package com.enset.prototype;


import java.util.Date;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Command command1=new Command(11L,1234L,new Date(), List.of("phone","lapTop","keyboard"));
        System.out.println("command 1 "+command1);
        System.out.println("------------------------------------");
        try {
            Command command2=command1.commandClone();
            System.out.println("command 2 "+command2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
