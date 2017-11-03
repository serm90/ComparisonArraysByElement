package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.OptionalInt;

public class JavaHome2 {


    public static void main(String[] args) throws IOException {

        int[] a = new int[] {2,6,10,11,18,21,36,100};

        OptionalInt max = Arrays.stream(a).max();
        OptionalInt min = Arrays.stream(a).min();

        System.out.println(max.getAsInt());
        System.out.println(min.getAsInt());
        }
    }


