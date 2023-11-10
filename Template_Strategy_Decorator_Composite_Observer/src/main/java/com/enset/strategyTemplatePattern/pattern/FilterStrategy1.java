package com.enset.strategyTemplatePattern.pattern;

public class FilterStrategy1 implements FilterStrategy{
    @Override
    public int[] filterStr(int[] data) {
        System.out.println("Strategy1");
        return data;
    }
}
