package com.enset.compositePattern;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Figure groupe = new Groupe();
        Figure rectangle=new Rectangle(5.00F, 2.5F);
        Figure cercle=new Cercle(3);
        ((Groupe)groupe).getFigures().add(rectangle);
        ((Groupe)groupe).getFigures().add(cercle);

        System.out.println("L'aire global est "+calculerAire((Groupe) groupe));
    }

    public static float calculerAire(Groupe groupe){
        float aireGlobal =0;
        for(Figure figure:((Groupe)groupe).getFigures()){
            if (figure instanceof Rectangle){
                aireGlobal+=((Rectangle)figure).getGrandCote()*((Rectangle)figure).getPetiteCote();
            } else if (figure instanceof Cercle) {
                aireGlobal+=((Cercle)figure).getRayon()*((Cercle)figure).getRayon()*Math.PI;
            } else if (figure instanceof Groupe) {
                aireGlobal+=calculerAire((Groupe) figure);
            }
        }
        return aireGlobal;
    }
}
