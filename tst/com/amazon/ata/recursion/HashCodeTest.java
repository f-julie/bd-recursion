package com.amazon.ata.recursion;

import com.amazon.ata.recursion.AtaLinkedList;
import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class HashCodeTest {

    @Test
    public void hashCode_emptyLists_equalHashCode() {
        // GIVEN
        AtaLinkedList expectedList = new AtaLinkedList();
        AtaLinkedList actualList = new AtaLinkedList();
        int expectedHashCode = expectedList.hashCode();

        // WHEN
        int actualHashCode = actualList.hashCode();

        // THEN
        assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void hashCode_equalObjects_equalHashCode() {
        // GIVEN
        AtaLinkedList expectedList = new AtaLinkedList();
        AtaLinkedList actualList = new AtaLinkedList();
        List<Double> dataList = ImmutableList.of(1.4, 2.2, 800.3, 999.0, -45.7);
        expectedList.addAll(dataList);
        actualList.addAll(dataList);
        int expectedHashCode = expectedList.hashCode();

        // WHEN
        int actualHashCode = actualList.hashCode();

        // THEN
        assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void hashCode_differentLengthLists_unequalHashCode() {
        // GIVEN
        AtaLinkedList otherList = new AtaLinkedList();
        otherList.addAll(ImmutableList.of(1.4, 2.2, 800.3));
        AtaLinkedList actualList = new AtaLinkedList();
        actualList.addAll(ImmutableList.of(1.4, 2.2, 800.3, 999.0, -45.7));
        int unexpectedHashCode = otherList.hashCode();

        // WHEN
        int actualHashCode = actualList.hashCode();

        // THEN
        assertNotEquals(unexpectedHashCode, actualHashCode);
    }

    @Test
    public void hashCode_listsWithDifferentValues_unequalHashCode() {
        // GIVEN
        AtaLinkedList otherList = new AtaLinkedList();
        otherList.addAll(ImmutableList.of(1.4, 2.2, 805.7, 999.0, -45.7));
        AtaLinkedList actualList = new AtaLinkedList();
        actualList.addAll(ImmutableList.of(1.4, 2.2, 800.3, 999.0, -45.7));
        int unexpectedHashCode = otherList.hashCode();

        // WHEN
        int actualHashCode = actualList.hashCode();

        // THEN
        assertNotEquals(unexpectedHashCode, actualHashCode);
    }
}
