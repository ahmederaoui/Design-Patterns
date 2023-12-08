package com.enset.compositePattern;

import java.util.List;

public class ClassesGroups extends ClassComposite{
    private List<ClassComposite> classComposites;

    public ClassesGroups(List<ClassComposite> classComposites) {
        this.classComposites = classComposites;
    }

    public ClassesGroups() {
    }

    public List<ClassComposite> getClassComposites() {
        return classComposites;
    }

    public void setClassComposites(List<ClassComposite> classComposites) {
        this.classComposites = classComposites;
    }
}
