package com.example.simplecalc;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        Calculator mCalculator = new Calculator();
        double resultAdd = mCalculator.add(1d, 1d);
        //assertTrue(resultAdd, is(equals(2d)));
        assertThat(resultAdd, is(equalTo(2d)));
    }

    @org.junit.jupiter.api.Test
    void sub() {
    }

    @org.junit.jupiter.api.Test
    void div() {
    }

    @org.junit.jupiter.api.Test
    void mul() {
    }
}