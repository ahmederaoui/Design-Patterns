package com.enset.builder;

public class Test {
    public static void main(String[] args) {
        Client client1=new Client(11L,"ahmed","eraoui","eraoui@gmail.com","Ouezzane");
        Client client2=Client.clientBuilder()
                .id(11L)
                .firstname("ahmed")
                .lastname("eraoui")
                .email("eraoui@gmail.com")
                .address("Ouezzane")
                .build();
        System.out.println("Client 1"+client1);
        System.out.println("Client 2"+client2);

    }
}
