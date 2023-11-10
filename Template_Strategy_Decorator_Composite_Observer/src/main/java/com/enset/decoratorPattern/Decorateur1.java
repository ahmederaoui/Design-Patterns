package com.enset.decoratorPattern;

public class Decorateur1 extends Decorateur{
    public Decorateur1() {
    }

    public Decorateur1(Composant composant) {
        super(composant);
    }

    @Override
    public void traitement() {
        composant.traitement();
        System.out.println("Decorateur 1");
    }
}
