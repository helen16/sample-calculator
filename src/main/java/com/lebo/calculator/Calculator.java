package com.lebo.calculator;

/**
 * Created by Helena Jackson on 2017-05-07.
 */
public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return 0;
    }

    public static int multiply(int a, int b) {
        return 0;
    }

    public static int divide(int a, int b) {
        if(b == 0) {
            throw  new IllegalArgumentException();
        }
        return 0;
    }

}
