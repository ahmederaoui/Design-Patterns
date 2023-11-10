package com.enset.decoratorPattern;

public class DecorateurTest {
    public static void main(String[] args) {
        Composant composant =new ComposantImpl();
        composant.traitement();
        System.out.println("-----------------------------------------------");
        composant = new Decorateur1(composant);
        composant.traitement();
        System.out.println("-----------------------------------------------");
        composant=new Decorateur2(composant);
        composant.traitement();
    }
}
