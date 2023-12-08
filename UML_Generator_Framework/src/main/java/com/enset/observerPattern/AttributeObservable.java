package com.enset.observerPattern;

import com.enset.classDiagramElements.Attribute;

import java.util.ArrayList;
import java.util.List;

public class AttributeObservable implements Observable{
    private List<Observer> observers=new ArrayList<>();
    private Attribute attribute;

    public AttributeObservable(Attribute attribute) {
        this.attribute = attribute;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(this);
        }
    }
    public Attribute getAttribute(){
        return this.attribute;
    }
    public void setAttribute(Attribute attribute){
        this.attribute=attribute;
        notifyObservers();
    }
}
