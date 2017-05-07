package com.lebo.test;

import com.lebo.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Helena Jackson on 2017-05-07.
 */

public class CalculatorTest {

    @Test
    public void should_add_two_numbers() {
        int expected = 5;
        int actual = Calculator.add(2, 3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_subtract_two_numbers() {
        int expected = 1;
        int actual = Calculator.subtract(3, 2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_multiply_two_numbers() {
        int expected = 6;
        int actual = Calculator.multiply(2, 3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_divide_two_numbers() {
        int expected = 3;
        int actual = Calculator.divide(6, 2);
        Assert.assertEquals(expected, actual);
    }
    @Test(expected = IllegalArgumentException.class)
    public void should_throw_error_on_division_by_zero(){
        Calculator.divide(5,0);
    }
}
