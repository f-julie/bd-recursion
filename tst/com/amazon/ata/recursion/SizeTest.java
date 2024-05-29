package com.amazon.ata.recursion;

import com.amazon.ata.recursion.AtaLinkedList;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SizeTest {
    private static final Random RANDOM = new Random();

    @Test
    public void size_emptyList_returns0() {
        // GIVEN
        AtaLinkedList ataLinkedList = new AtaLinkedList();

        // WHEN
        int size = ataLinkedList.size();

        // THEN
        assertEquals(0, size);
    }

    @Test
    public void size_singleItemList_returns1() {
        // GIVEN
        AtaLinkedList ataLinkedList = new AtaLinkedList();
        double value = RANDOM.nextDouble();
        ataLinkedList.addFirst(value);

        // WHEN
        int size = ataLinkedList.size();

        // THEN
        assertEquals(1, size);
    }

    @Test
    public void size_multiItemList_returnsNumberOfItems() {
        // GIVEN
        int numberOfItemsInList = 100;
        Double expectedSum = 0.0;

        AtaLinkedList ataLinkedList = new AtaLinkedList();
        for (int i = 0; i < numberOfItemsInList; i++) {
            double value = RANDOM.nextDouble();
            expectedSum += value;
            ataLinkedList.addLast(value);
        }

        // WHEN
        int size = ataLinkedList.size();

        // THEN
        assertEquals(numberOfItemsInList, size);
    }
}
