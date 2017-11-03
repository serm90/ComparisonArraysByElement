package com.company;

import java.io.IOException;
import java.lang.reflect.Array;

public class ComparisonNumber {

    public static void main(String[] args) throws IOException {
        int[] a = new int[] {2,6,10,11,18,21,36,100,100};
        int[] b = new int[] {3,9,16,121,23,2,6,10,70};

        for(int i = 0; i < a.length; i++){
            for (int j = 0; j < b.length; j++){
                System.out.println("a == b is" + Array.toString(a));
            }

        }

    }
}
