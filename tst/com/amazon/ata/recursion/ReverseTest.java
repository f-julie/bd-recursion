package com.amazon.ata.recursion;

import com.amazon.ata.recursion.AtaLinkedList;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest {
    private static final Random RANDOM = new Random();

    @Test
    public void reverse_emptyList_returnsEmptyList() {
        // GIVEN
        AtaLinkedList ataLinkedList = new AtaLinkedList();

        // WHEN
        AtaLinkedList reversed = ataLinkedList.reverse();

        // THEN
        assertEquals(new AtaLinkedList(), reversed);
    }

    @Test
    public void reverse_singleItemList_returnsSingleItemList() {
        // GIVEN
        AtaLinkedList ataLinkedList = new AtaLinkedList();
        double value = RANDOM.nextDouble();
        ataLinkedList.addFirst(value);

        // WHEN
        AtaLinkedList reversed = ataLinkedList.reverse();

        // THEN
        assertEquals(ataLinkedList, reversed);
    }

    @Test
    public void reverse_multiItemList_returnsValuesInReverseOrder() {
        // GIVEN
        int numberOfItemsInList = 100;
        AtaLinkedList expected = new AtaLinkedList();

        AtaLinkedList ataLinkedList = new AtaLinkedList();
        for (int i = 0; i < numberOfItemsInList; i++) {
            double value = RANDOM.nextDouble();
            ataLinkedList.addLast(value);
            expected.addFirst(value);
        }

        // WHEN
        AtaLinkedList reversed = ataLinkedList.reverse();

        // THEN
        assertEquals(expected, reversed);
    }
}
