package com.enset.singleton;

public class  Singleton {
    private static Singleton singleton;
    private String patternName="Singleton";
    static {
        singleton=new Singleton();
    }

    private Singleton() {
    }
    public static Singleton getInstance(){
        return singleton;
    }
    public String getPatternName(){
        return patternName;
    }

    public void setSingleton(String newName){
        this.patternName=newName;
    }

}
