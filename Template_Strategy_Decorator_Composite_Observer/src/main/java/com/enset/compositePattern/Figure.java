package com.enset.compositePattern;

public class Figure {
    private float aire;
    private float perimetre;

    public Figure() {
    }

    public Figure(float aire, float perimetre) {
        this.aire = aire;
        this.perimetre = perimetre;
    }

    public float getAire() {
        return aire;
    }

    public void setAire(float aire) {
        this.aire = aire;
    }

    public float getPerimetre() {
        return perimetre;
    }

    public void setPerimetre(float perimetre) {
        this.perimetre = perimetre;
    }
}
