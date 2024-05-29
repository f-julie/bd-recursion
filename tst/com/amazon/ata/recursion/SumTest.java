package com.amazon.ata.recursion;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static com.amazon.ata.recursion.DoubleUtils.assertDoubleEquals;

public class SumTest {
    private static final Random RANDOM = new Random();

    @Test
    public void sum_emptyList_returns0() {
        // GIVEN
        AtaLinkedList ataLinkedList = new AtaLinkedList();

        // WHEN
        Double sum = ataLinkedList.sum();

        // THEN
        assertDoubleEquals(0.0, sum);
    }

    @Test
    public void sum_singleItemList_returns1() {
        // GIVEN
        AtaLinkedList ataLinkedList = new AtaLinkedList();
        double value = RANDOM.nextDouble();
        ataLinkedList.addFirst(value);

        // WHEN
        Double sum = ataLinkedList.sum();

        // THEN
        assertDoubleEquals(value, sum);
    }

    @Test
    public void sum_multiItemList_returnsSumOfDataInList() {
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
        Double sum = ataLinkedList.sum();

        // THEN
        assertDoubleEquals(expectedSum, sum);
    }
}
