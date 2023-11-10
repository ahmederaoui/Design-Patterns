package com.enset.observerPattern;

public interface Joueur {
    void addObject(GameObject gameObject);
    void removeObject(GameObject gameObject);
    void notifyObjects();
}
