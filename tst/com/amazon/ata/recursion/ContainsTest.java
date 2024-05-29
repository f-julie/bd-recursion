package com.amazon.ata.recursion;

import com.amazon.ata.recursion.AtaLinkedList;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class ContainsTest {
    private static final Random RANDOM = new Random();

    @Test
    public void contains_emptyList_returnsFalse() {
        // GIVEN
        Double number = 4.3;
        AtaLinkedList ataLinkedList = new AtaLinkedList();

        // WHEN
        boolean contains = ataLinkedList.contains(number);

        // THEN
        assertFalse(contains);
    }

    @Test
    public void contains_singleItemListInList_returnsTrue() {
        // GIVEN
        AtaLinkedList ataLinkedList = new AtaLinkedList();
        double value = RANDOM.nextDouble();
        ataLinkedList.addFirst(value);

        // WHEN
        boolean contains = ataLinkedList.contains(value);

        // THEN
        assertTrue(contains);
    }

    @Test
    public void contains_singleItemListNotInList_returnsFalse() {
        // GIVEN
        AtaLinkedList ataLinkedList = new AtaLinkedList();
        double value = RANDOM.nextDouble();
        ataLinkedList.addFirst(value);

        // WHEN
        boolean contains = ataLinkedList.contains(value + 1.0);

        // THEN
        assertFalse(contains);
    }

    @Test
    public void contains_multiItemListInList_returnsTrue() {
        // GIVEN
        int numberOfItemsInList = 100;
        double lastValue = 0.0;

        AtaLinkedList ataLinkedList = new AtaLinkedList();
        for (int i = 0; i < numberOfItemsInList; i++) {
            double value = RANDOM.nextDouble();
            ataLinkedList.addLast(value);
            lastValue = value;
        }

        // WHEN
        boolean contains = ataLinkedList.contains(lastValue);

        // THEN
        assertTrue(contains);
    }

    @Test
    public void contains_multiItemListInList_returnsFalse() {
        // GIVEN
        int numberOfItemsInList = 100;
        double lastValue = 0.0;

        AtaLinkedList ataLinkedList = new AtaLinkedList();
        for (int i = 0; i < numberOfItemsInList; i++) {
            double value = RANDOM.nextDouble();
            ataLinkedList.addLast(value);
            lastValue = value;
        }

        // WHEN
        boolean contains = ataLinkedList.contains(lastValue + 1.0);

        // THEN
        assertFalse(contains);
    }
}
