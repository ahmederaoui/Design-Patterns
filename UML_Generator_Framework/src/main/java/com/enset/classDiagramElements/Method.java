package com.enset.classDiagramElements;

import com.enset.classDiagramElements.enums.Visibility;

import java.util.List;

public class Method {
    private String name;
    private String returnType;
    private Visibility visibility;
    private boolean isStatic;
    private boolean isFinal;
    private List<Parameter> parameters;
}
