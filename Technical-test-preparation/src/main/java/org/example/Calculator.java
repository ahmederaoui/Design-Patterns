package org.example;

public class Calculator {
    public int calculate(String numbers) throws IllegalFormOfString {
        String[] lines=numbers.split("\n");
        //String separator = ",";
        int result =0;
        for (int i=1;i<lines.length;i++){
            if (lines[i].endsWith("|")) throw new IllegalFormOfString("separator at the end");
            String[] nums = lines[i].split("|");
            for (String num:nums){
                System.out.println(num);
                result+=Integer.valueOf(num);
            }
        }
        return result;
    }
}
