package com.enset.strategyTemplatePattern.client;

import com.enset.strategyTemplatePattern.pattern.FilterStrategy1;
import com.enset.strategyTemplatePattern.pattern.FilterStrategy2;
import com.enset.strategyTemplatePattern.pattern.ImageCompress;
import com.enset.strategyTemplatePattern.pattern.ImageProcessor;

import java.util.Scanner;

public class StrategyTemplateTest {
    public static void main(String[] args) {
        int[] data={1,2,3,3,4,4};
        ImageProcessor imageProcessor=new ImageCompress();
        Scanner in=new Scanner(System.in);
        while(true){
            System.out.println("Type 1 or 2 to chose with which strategy you want to work :");
            int choice=in.nextInt();
            if (choice==1){
                imageProcessor.setFilterStrategy(new FilterStrategy1());
                break;
            } else if (choice==2) {
                imageProcessor.setFilterStrategy(new FilterStrategy2());
                break;
            }
        }
        imageProcessor.filter(data);
        imageProcessor.compress(data);
    }
}
