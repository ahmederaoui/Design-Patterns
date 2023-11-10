package com.enset.decoratorPattern;

public class ComposantImpl implements Composant {
    @Override
    public void traitement() {
        System.out.println("Implementation sans decorateur");
    }
}
