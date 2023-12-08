package com.enset;

import com.enset.classDiagramElements.Relation;
import com.enset.compositePattern.ClassesGroups;
import com.enset.observerPattern.Observer;
import com.enset.strategyPattern.codeGeneration.CodeGenerationStrategy;
import com.enset.strategyPattern.exportation.DiagramExporterStrategy;

import java.util.ArrayList;
import java.util.List;

public class ClassDiagram {
    private ClassesGroups classesGroups;
    private List<Relation> relations=new ArrayList<>();
    private CodeGenerationStrategy codeGenerationStrategy;
    private DiagramExporterStrategy diagramExporterStrategy;
    private Observer observer;

    public ClassDiagram(ClassesGroups classesGroups, List<Relation> relations, CodeGenerationStrategy codeGenerationStrategy, DiagramExporterStrategy diagramExporterStrategy, Observer observer) {
        this.classesGroups = classesGroups;
        this.relations = relations;
        this.codeGenerationStrategy = codeGenerationStrategy;
        this.diagramExporterStrategy = diagramExporterStrategy;
        this.observer = observer;
    }

    public ClassDiagram() {
    }

    public ClassesGroups getClassesGroups() {
        return classesGroups;
    }

    public void setClassesGroups(ClassesGroups classesGroups) {
        this.classesGroups = classesGroups;
    }

    public List<Relation> getRelations() {
        return relations;
    }

    public void setRelations(List<Relation> relations) {
        this.relations = relations;
    }

    public CodeGenerationStrategy getCodeGenerationStrategy() {
        return codeGenerationStrategy;
    }

    public DiagramExporterStrategy getDiagramExporterStrategy() {
        return diagramExporterStrategy;
    }

    public Observer getObserver() {
        return observer;
    }

    public void setObserver(Observer observer) {
        this.observer = observer;
    }

    public void setCodeGenerationStrategy(CodeGenerationStrategy codeGenerationStrategy) {
        this.codeGenerationStrategy = codeGenerationStrategy;
    }

    public void setDiagramExporterStrategy(DiagramExporterStrategy diagramExporterStrategy) {
        this.diagramExporterStrategy = diagramExporterStrategy;
    }
}
