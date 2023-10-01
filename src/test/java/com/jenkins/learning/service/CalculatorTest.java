package com.jenkins.learning.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calc = new Calculator();

    @Test
    public void testSum() {
	assertEquals(5, calc.sum(3, 2));
	assertEquals(100, calc.sum(50, 50));

    }
}
