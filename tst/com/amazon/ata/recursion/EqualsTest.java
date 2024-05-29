package com.amazon.ata.recursion;

import com.amazon.ata.recursion.AtaLinkedList;
import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import java.util.List;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class EqualsTest {

    @Test
    public void equals_otherIsNull_returnsFalse() {
        // GIVEN
        AtaLinkedList list = new AtaLinkedList();
        AtaLinkedList other = new AtaLinkedList();

        // WHEN
        boolean isEqual = list.equals(other);

        // THEN
        assertTrue(isEqual);
    }

    @Test
    public void equals_sameReference_returnsTrue() {
        // GIVEN
        AtaLinkedList list = new AtaLinkedList();
        AtaLinkedList other = list;

        // WHEN
        boolean isEqual = list.equals(other);

        // THEN
        assertTrue(isEqual);
    }

    @Test
    public void equals_differentType_returnsFalse() {
        // GIVEN
        AtaLinkedList list = new AtaLinkedList();
        String other = "AtaLinkedList";

        // WHEN
        boolean isEqual = list.equals(other);

        // THEN
        assertFalse(isEqual);
    }

    @Test
    public void equals_emptyLists_returnsTrue() {
        // GIVEN
        AtaLinkedList list = new AtaLinkedList();
        AtaLinkedList other = new AtaLinkedList();

        // WHEN
        boolean isEqual = list.equals(other);

        // THEN
        assertTrue(isEqual);
    }

    @Test
    public void equals_sameValues_returnTrue() {
        // GIVEN
        AtaLinkedList list = new AtaLinkedList();
        AtaLinkedList other = new AtaLinkedList();
        List<Double> dataList = ImmutableList.of(1.4, 2.2, 800.3, 999.0, -45.7);
        list.addAll(dataList);
        other.addAll(dataList);

        // WHEN
        boolean isEqual = list.equals(other);

        // THEN
        assertTrue(isEqual);
    }

    @Test
    public void equals_differentLengthLists_returnFalse() {
        // GIVEN
        AtaLinkedList list = new AtaLinkedList();
        list.addAll(ImmutableList.of(1.4, 2.2, 800.3));
        AtaLinkedList other = new AtaLinkedList();
        other.addAll(ImmutableList.of(1.4, 2.2, 800.3, 999.0, -45.7));

        // WHEN
        boolean isEqual = list.equals(other);

        // THEN
        assertFalse(isEqual);
    }

    @Test
    public void equals_listsWithDifferentValues_returnsFalse() {
        // GIVEN
        AtaLinkedList list = new AtaLinkedList();
        list.addAll(ImmutableList.of(1.4, 2.2, 805.7, 999.0, -45.7));
        AtaLinkedList other = new AtaLinkedList();
        other.addAll(ImmutableList.of(1.4, 2.2, 800.3, 999.0, -45.7));

        // WHEN
        boolean isEqual = list.equals(other);

        // THEN
        assertFalse(isEqual);
    }
}
