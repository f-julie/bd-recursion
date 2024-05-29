package com.amazon.ata.recursion;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * A bare-bones singly-linked list implementation
 */
public class AtaLinkedList {
    private AtaNode head;
    private AtaNode tail;

    /**
     * Constructs a new, empty linked list.
     */
    public AtaLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Add an entry as the new first element in the list
     * @param data The new value to add at the head of the list
     */
    public void addFirst(final Double data) {
        AtaNode newHead = new AtaNode(data, head);
        this.head = newHead;
        if (this.tail == null) {
            this.tail = newHead;
        }
    }

    /**
     * Add an entry as the new last element in the list
     * @param data The new value to add at the tail of the list
     */
    public void addLast(final Double data) {
        AtaNode ataNode = new AtaNode(data, null);

        if (this.head == null) {
            this.head = ataNode;
            this.tail = head;
        } else {
            this.tail.setNext(ataNode);
            this.tail = this.tail.getNext();
        }
    }

    /**
     * Returns the value of the first element in the list.
     * Throws IndexOutOfBoundsException if the list is empty.
     * @return the first value, or null if list. isempty
     */
    public Double getFirst() {
        return get(0);
    }

    /**
     * Returns the value of the Nth element in the list (zero-indexed).
     * Throws IndexOutOfBoundsException if n is size of list or
     * greater, or if n is negative.
     *
     * We normally would not want to call this method often on a linked
     * list because it is O(n), but this might be helpful for your
     * reverse() unit tests.
     *
     * @param n the index of the element to return data from
     * @return The value at that element, if the element exists
     */
    @VisibleForTesting
    public Double get(int n) {
        AtaNode node = this.head;
        for (int i = 0; i < n; i++) {
            if (node == null) {
                break;
            }
            node = node.getNext();
        }
        if (node == null) {
            throw new IndexOutOfBoundsException("n was too big for this list: " + n);
        }

        return node.getData();
    }

    /**
     * Add the collection's data values to the end of the list.
     * @param collection The collection of Double to add to the list
     */
    public void addAll(final Collection<Double> collection) {
        for (Double data : collection) {
            addLast(data);
        }
    }

    /**
     * Computes and returns the sum of all Double elements in the list
     * @return The sum of all elements in the list
     */
    public Double sum() {
        // PARTICIPANTS: calculate the sum of this AtaLinkedList

        throw new UnsupportedOperationException();
    }

    /**
     * Creates a new AtaLinkedList that has all of the values of this
     * AtaLinkedList in reverse order
     * @return a new reverse order list
     */
    public AtaLinkedList reverse() {
        // PARTICIPANTS: create the reversed AtaLinkedList

        throw new UnsupportedOperationException();
    }

    // EXTENSION
    /**
     * Calculates the size of the linked list. The number of nodes
     * with data.
     * @return size of the linked list
     */
    public int size() {
        throw new UnsupportedOperationException();
    }

    // EXTENSION
    /**
     * Determines if the list contains a node with a double equal
     * to the number specified.
     * @param number to check for in the list
     * @return true, if the list contains the number.
     */
    public boolean contains(Double number) {
        throw new UnsupportedOperationException();
    }

    // EXTENSION
    /**
     * Computes and returns the max of all Double elements in the list
     * @return The max double in the list.
     */
    public Double max() {
        throw new UnsupportedOperationException();
    }

    // EXTENSION
    @Override
    public int hashCode() {
        List<Double> values = new ArrayList<>();
        AtaNode node = head;
        while (node != null) {
            values.add(node.getData());
            node = node.getNext();
        }
        return Objects.hash(values.toArray());
    }

    // EXTENSION
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AtaLinkedList other = (AtaLinkedList) o;
        AtaNode thisNode = this.head;
        AtaNode otherNode = other.head;
        while(thisNode != null && otherNode != null) {
            if (!thisNode.getData().equals(otherNode.getData())) {
                return false;
            }
            thisNode = thisNode.getNext();
            otherNode = otherNode.getNext();
        }

        if (thisNode == null && otherNode == null) {
            return true;
        }

        return false;
    }

    // EXTENSION
    @Override
    public String toString() {
        AtaNode node = head;
        StringBuilder stringBuilder = new StringBuilder("[");

        while(node != null) {
            stringBuilder.append(node.getData())
                    .append(", ");
        }
        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}
