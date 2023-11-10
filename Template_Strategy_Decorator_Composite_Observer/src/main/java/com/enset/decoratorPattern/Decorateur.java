package com.enset.decoratorPattern;

public abstract class Decorateur implements Composant {
    protected Composant composant;

    public Decorateur() {
    }

    public Decorateur(Composant composant) {
        this.composant = composant;
    }

    public abstract void traitement();
}
