package com.enset.compositePattern;

public class Cercle extends Figure {
    private float Rayon;

    public Cercle() {
    }

    public Cercle(float rayon) {
        Rayon = rayon;
    }

    public Cercle(float aire, float perimetre, float rayon) {
        super(aire, perimetre);
        Rayon = rayon;
    }

    public float getRayon() {
        return Rayon;
    }

    public void setRayon(float rayon) {
        Rayon = rayon;
    }
}
