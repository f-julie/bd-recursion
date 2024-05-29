package com.amazon.ata.recursion;

/**
 * An individual node in a singly-linked AtaLinkedList, containing a Double
 * as the data of each element.
 */
public class AtaNode {
    private Double data;
    private AtaNode next;

    /**
     * Constructs a new node.
     * @param data The data to be contained in the node
     * @param next Reference to the next node in the list
     */
    public AtaNode(final Double data, final AtaNode next) {
        this.data = data;
        this.next = next;
    }

    public Double getData() {
        return data;
    }

    public void setData(final Double data) {
        this.data = data;
    }

    public AtaNode getNext() {
        return next;
    }

    public void setNext(final AtaNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" + "data=" + data + '}';
    }
}
