package com.enset.strategyPattern.exportation;

public class JsonExporterDiagram implements DiagramExporterStrategy{
    @Override
    public void exportDiagram() {
        System.out.println("Diagram as Json");
    }
}
