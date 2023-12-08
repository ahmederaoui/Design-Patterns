package com.enset.observerPattern;

public class AttributeLoggerObserver implements Observer {

    @Override
    public void update(Observable observable) {
        System.out.println("Attribute  Changer " +((AttributeObservable)observable).getAttribute().getName());
    }
}
