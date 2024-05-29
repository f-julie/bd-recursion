package com.amazon.ata.recursion;

import com.amazon.ata.recursion.AtaLinkedList;
import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GetTest {

    @Test
    public void get_singleElementList_returnsData() {
        // GIVEN
        AtaLinkedList ataLinkedList = new AtaLinkedList();
        Double data = 0.2;
        ataLinkedList.addLast(data);

        // WHEN
        Double result = ataLinkedList.get(0);

        // THEN
        assertEquals(data, result);
    }

    @Test
    public void get_firstElement_returnsData() {
        // GIVEN
        AtaLinkedList ataLinkedList = new AtaLinkedList();
        List<Double> dataList = ImmutableList.of(1.0, 2.0, 3.0);
        Double data = dataList.get(0);
        ataLinkedList.addAll(dataList);

        // WHEN
        Double result = ataLinkedList.get(0);

        // THEN
        assertEquals(data, result);
    }

    @Test
    public void get_middleElement_returnsData() {
        // GIVEN
        AtaLinkedList ataLinkedList = new AtaLinkedList();
        List<Double> dataList = ImmutableList.of(1.0, 2.0, 3.0, 4.0, 5.0);
        int indexToCheck = 3;
        Double data = dataList.get(indexToCheck);
        ataLinkedList.addAll(dataList);

        // WHEN
        Double result = ataLinkedList.get(indexToCheck);

        // THEN
        assertEquals(data, result);
    }

    @Test
    public void get_LastElement_returnsData() {
        // GIVEN
        AtaLinkedList ataLinkedList = new AtaLinkedList();
        List<Double> dataList = ImmutableList.of(1.0, 2.0, 3.0, 4.0, 5.0, 44.1, 98.6, 451.0);
        int indexToCheck = dataList.size() - 1;
        Double data = dataList.get(indexToCheck);
        ataLinkedList.addAll(dataList);

        // WHEN
        Double result = ataLinkedList.get(indexToCheck);

        // THEN
        assertEquals(data, result);
    }


    @Test
    public void get_negativeIndex_throwsException() {
        // GIVEN
        AtaLinkedList ataLinkedList = new AtaLinkedList();

        // WHEN + THEN
        assertThrows(IndexOutOfBoundsException.class, () -> ataLinkedList.get(-10));
    }

    @Test
    public void get_emptyList_throwsException() {
        // GIVEN
        AtaLinkedList ataLinkedList = new AtaLinkedList();

        // WHEN + THEN
        assertThrows(IndexOutOfBoundsException.class, () -> ataLinkedList.get(0));
    }

    @Test
    public void get_beyondLastElement_throwsException() {
        // GIVEN
        AtaLinkedList ataLinkedList = new AtaLinkedList();
        List<Double> dataList = ImmutableList.of(1.4, 2.2, 800.3, 999.0, -45.7);
        ataLinkedList.addAll(dataList);

        // WHEN + THEN
        assertThrows(IndexOutOfBoundsException.class, () -> ataLinkedList.get(dataList.size()));
    }
}
