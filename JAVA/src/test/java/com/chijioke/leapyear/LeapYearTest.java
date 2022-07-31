package com.chijioke.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    public void test_that1994IsALeapYear () {

        LeapYear leapYear = new LeapYear();

        assertEquals(true, leapyear.check(1996));
    }

}