package com.enset.strategyTemplatePattern.pattern;

public abstract class ImageProcessor {
    private FilterStrategy filterStrategy;
    public int[] filter(int[] data){
        return filterStrategy.filterStr(data);
    }
    public int[] compress(int[] data){
        int[] data1=part1(data);
        int[] data2=part2(data1);
        return data2;
    }
    protected abstract int[] part1(int[] data);
    protected abstract int[] part2(int[] data);

    public FilterStrategy getFilterStrategy() {
        return filterStrategy;
    }

    public void setFilterStrategy(FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }
}
