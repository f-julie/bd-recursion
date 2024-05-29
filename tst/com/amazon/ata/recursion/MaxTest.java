package com.amazon.ata.recursion;

import com.amazon.ata.recursion.AtaLinkedList;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static junit.framework.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxTest {
    private static final Random RANDOM = new Random();

    @Test
    public void max_emptyList_returnsNull() {
        // GIVEN
        AtaLinkedList ataLinkedList = new AtaLinkedList();

        // WHEN
        Double max = ataLinkedList.max();

        // THEN
        assertNull(max);
    }

    @Test
    public void max_singleItemList_returnsNodeValue() {
        // GIVEN
        AtaLinkedList ataLinkedList = new AtaLinkedList();
        double value = RANDOM.nextDouble();
        ataLinkedList.addFirst(value);

        // WHEN
        Double max = ataLinkedList.max();

        // THEN
        assertEquals(value, max);
    }

    @Test
    public void max_multiItemList_returnsLargestValue() {
        // GIVEN
        int numberOfItemsInList = 100;
        Double largestValue = Double.MIN_VALUE;

        AtaLinkedList ataLinkedList = new AtaLinkedList();
        for (int i = 0; i < numberOfItemsInList; i++) {
            double value = RANDOM.nextDouble();
            ataLinkedList.addLast(value);

            if (value > largestValue) {
                largestValue = value;
            }
        }

        // WHEN
        Double max = ataLinkedList.max();

        // THEN
        assertEquals(largestValue, max);
    }
}
