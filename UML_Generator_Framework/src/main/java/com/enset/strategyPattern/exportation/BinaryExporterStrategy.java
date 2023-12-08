package com.enset.strategyPattern.exportation;

public class BinaryExporterStrategy implements DiagramExporterStrategy{
    @Override
    public void exportDiagram() {
        System.out.println("Diagram as Binary");
    }
}
