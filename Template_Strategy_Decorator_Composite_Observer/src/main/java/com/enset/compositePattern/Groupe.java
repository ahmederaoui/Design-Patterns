package com.enset.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Groupe extends Figure{
    private List<Figure> figures = new ArrayList<>();

    public Groupe() {
    }

    public Groupe(List<Figure> figures) {
        this.figures = figures;
    }

    public Groupe(float aire, float perimetre, List<Figure> figures) {
        super(aire, perimetre);
        this.figures = figures;
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }
}
