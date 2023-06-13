package com.example.softwarelifecyclemanagement.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateServiceTest {


    @Test
    public void testCalculate() {
        CalculateService calculateService = new CalculateService();
        String text = "1001000";
        int result = calculateService.calculate(text);
        assertEquals(2, result);
    }

    @Test
    public void testGetPrevious() {
        CalculateService calculateService = new CalculateService();
        String previous = calculateService.getPrevious();
        assertEquals("0", previous);
        String text = "1001000";
        calculateService.calculate(text);
        previous = calculateService.getPrevious();
        assertEquals(text, previous);
    }
}