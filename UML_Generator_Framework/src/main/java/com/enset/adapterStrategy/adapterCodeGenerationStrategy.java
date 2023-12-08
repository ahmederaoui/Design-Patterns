package com.enset.adapterStrategy;

import com.enset.strategyPattern.codeGeneration.CodeGenerationStrategy;

public class adapterCodeGenerationStrategy implements CodeGenerationStrategy {
    private OldCodeGenerationStrategy oldCodeGenerationStrategy;
    @Override
    public void generateCode() {
        oldCodeGenerationStrategy.oldGenerateCode();
    }
}
