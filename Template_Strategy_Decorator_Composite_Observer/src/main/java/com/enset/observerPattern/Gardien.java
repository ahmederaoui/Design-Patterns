package com.enset.observerPattern;

public class Gardien implements GameObject{
    @Override
    public void update(int score) {
        System.out.println("score updated");
    }
}
