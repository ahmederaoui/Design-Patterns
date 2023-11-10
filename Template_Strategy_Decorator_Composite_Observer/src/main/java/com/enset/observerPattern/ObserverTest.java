package com.enset.observerPattern;

public class ObserverTest {
    public static void main(String[] args) {
        Joueur joueur1 =new JoueurImpl();
        GameObject camera=new Camera();
        GameObject couloire=new Couloire();
        ((JoueurImpl)joueur1).setScore(12);
        joueur1.addObject(camera);
        joueur1.addObject(couloire);
        joueur1.notifyObjects();
    }
}
