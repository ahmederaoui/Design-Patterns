package com.enset.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class JoueurImpl implements Joueur{
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private List<GameObject> gameObjects=new ArrayList<>();

    @Override
    public void addObject(GameObject gameObject) {
        gameObjects.add(gameObject);
    }

    @Override
    public void removeObject(GameObject gameObject) {
        gameObjects.remove(gameObject);
    }

    @Override
    public void notifyObjects() {
        for (GameObject gameObject:
             gameObjects) {
            gameObject.update(score);
        }
    }
}
