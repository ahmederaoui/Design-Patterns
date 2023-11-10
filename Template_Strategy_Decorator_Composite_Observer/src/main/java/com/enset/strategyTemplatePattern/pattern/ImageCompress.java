package com.enset.strategyTemplatePattern.pattern;

public class ImageCompress extends ImageProcessor{
    @Override
    protected int[] part1(int[] data) {
        System.out.println("1st part of compressing");
        return data;
    }

    @Override
    protected int[] part2(int[] data) {
        System.out.println("2cd part of compressing");
        return data;
    }
}
