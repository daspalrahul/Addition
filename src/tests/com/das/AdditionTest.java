package com.das;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void additionOfZeroAndZeroShouldReturnZero() {
        Addition a = new Addition(0, 0);

        int actualResult = a.add();
        assertEquals(0, actualResult);
    }

    @Test
    public void additionOfZeroAndOneShouldReturnOne() {
        Addition a = new Addition(0, 1);

        int actualResult = a.add();
        assertEquals(1, actualResult);
    }

}