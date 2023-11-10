package com.enset.compositePattern;

public class Rectangle extends Figure{
    private float grandCote;
    private float petiteCote;

    public Rectangle() {;
    }

    public Rectangle(float grandCote, float petiteCote) {
        this.grandCote = grandCote;
        this.petiteCote = petiteCote;
    }

    public Rectangle(float aire, float perimetre, float grandCote, float petiteCote) {
        super(aire, perimetre);
        this.grandCote = grandCote;
        this.petiteCote = petiteCote;
    }

    public float getGrandCote() {
        return grandCote;
    }

    public void setGrandCote(float grandCote) {
        this.grandCote = grandCote;
    }

    public float getPetiteCote() {
        return petiteCote;
    }

    public void setPetiteCote(float petiteCote) {
        this.petiteCote = petiteCote;
    }
}
