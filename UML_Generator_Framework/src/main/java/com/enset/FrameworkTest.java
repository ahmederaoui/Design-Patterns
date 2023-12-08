package com.enset;

import com.enset.classDiagramElements.Attribute;
import com.enset.classDiagramElements.ClassEntity;
import com.enset.classDiagramElements.Relation;
import com.enset.classDiagramElements.enums.Cardinality;
import com.enset.classDiagramElements.enums.RelationType;
import com.enset.classDiagramElements.enums.Visibility;
import com.enset.compositePattern.ClassesGroups;
import com.enset.observerPattern.AttributeLoggerObserver;
import com.enset.observerPattern.AttributeObservable;

public class FrameworkTest {
    public static void main(String[] args) {
        ClassDiagram classDiagram = new ClassDiagram();

        // Création de classes et ajout à des groupes
        ClassEntity classA = new ClassEntity("ClassA");
        ClassEntity classB = new ClassEntity("ClassB");

        ClassesGroups group1 = new ClassesGroups();
        group1.getClassComposites().add(classA);


        ClassesGroups group2 = new ClassesGroups();
        group2.getClassComposites().add(classB);
        group1.getClassComposites().add(group2);

        classDiagram.setClassesGroups(group1);

        // Ajout d'une relation entre ClassA et ClassB
        Relation relation = new Relation(classA, classB, Cardinality.ONE_TO_MANY, Cardinality.ONE_TO_ONE, RelationType.ASSOCIATION_UNIDIRECTIONAL);
        classDiagram.getRelations().add(relation);

        // Ajout d'un observateur (logger) pour suivre les changements d'état d'attributs
        AttributeLoggerObserver attributeLogger = new AttributeLoggerObserver();

        // Modification de l'état d'un attribut dans ClassA
        Attribute attribute=new Attribute("attributeX", "String", Visibility.PRIVATE, false, false);
        AttributeObservable attributeObservable=new AttributeObservable(attribute);
        attributeObservable.addObserver(attributeLogger);
    }
}