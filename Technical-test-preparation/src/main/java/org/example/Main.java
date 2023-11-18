package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] tb={1,1,2,4,2,3,2};
        int[] tb1=dToNd(tb);

        Arrays.stream(tb1).forEach(s-> System.out.println(s));
        char[] myName={'a','h','m','e','d'};
        System.out.println(toString(myName));
        System.out.println(maxT(tb));
    }

    public static int[] dToNd(int[] tb){
        return Arrays.stream(tb).distinct().toArray();
    }
    public static String toString(char[] chras){
        return new String(chras);
    }
    public static int maxT(int[] tb){
        int maxIndex=0;
        for (int i:tb){
            if(tb[i]>tb[maxIndex]) maxIndex=i;
        }
        return tb[maxIndex];
    }
}