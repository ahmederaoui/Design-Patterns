package com.enset.decoratorPattern;

public class Decorateur2 extends Decorateur{
    public Decorateur2() {
    }

    public Decorateur2(Composant composant) {
        super(composant);
    }

    @Override
    public void traitement() {
        composant.traitement();
        System.out.println("Decorateur 2");
    }
}
