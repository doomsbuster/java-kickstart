package com.stevens.cs.l1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNumbersTest {

    @Test
    void test_getSum_Returns_Correct_Totals() {
        SumOfNumbers sumOfNumbers = new SumOfNumbers();
        assertEquals(8630,sumOfNumbers.getSum());
    }
}