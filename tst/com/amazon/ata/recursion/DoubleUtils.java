package com.amazon.ata.recursion;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DoubleUtils {
    private static final double THRESHOLD = .000001;

    public static void assertDoubleEquals(Double expected, Double actual) {
         assertTrue(equals(expected, actual), String.format("Expected %f, but actually %f.", expected, actual));
    }

    public static void assertDoubleNotEquals(Double unexpected, Double actual) {
        assertFalse(equals(unexpected, actual), String.format("Should not equal %f, but was %f.", unexpected, actual));
    }

    private static boolean equals(Double expected, Double actual) {
        return Math.abs(expected - actual) < THRESHOLD;
    }
}
