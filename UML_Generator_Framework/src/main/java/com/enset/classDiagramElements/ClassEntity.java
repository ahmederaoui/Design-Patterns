package com.enset.classDiagramElements;

import com.enset.compositePattern.ClassComposite;

import java.util.ArrayList;
import java.util.List;

public class ClassEntity extends ClassComposite {
    private String name;
    private List<Attribute> attributes;
    private List<Method> methods;
    private List<Relation> relations;

    public ClassEntity(String name) {
        this.name = name;
        this.attributes = new ArrayList<>();
        this.methods = new ArrayList<>();
        this.relations = new ArrayList<>();
    }
}
