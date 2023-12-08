package com.enset.classDiagramElements;

import com.enset.classDiagramElements.enums.Cardinality;
import com.enset.classDiagramElements.enums.RelationType;

public class Relation {
    private ClassEntity sourceEntity;
    private ClassEntity destinationEntity;
    private Cardinality sourceCardinality;
    private Cardinality destinationCardinality;
    private RelationType type;

    public Relation(ClassEntity sourceEntity, ClassEntity destinationEntity, Cardinality sourceCardinality, Cardinality destinationCardinality, RelationType type) {
        this.sourceEntity = sourceEntity;
        this.destinationEntity = destinationEntity;
        this.sourceCardinality = sourceCardinality;
        this.destinationCardinality = destinationCardinality;
        this.type = type;
    }
}
