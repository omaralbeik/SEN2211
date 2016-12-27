package com.omaralbeik.linkedList;

/**
 * Created by omar on 28/12/2016.
 */
public class DoublyNode {

    private DoublyNode previous;
    private DoublyNode next;
    private String value;

    public DoublyNode() {
        previous = next = null;
        value = null;
    }

    public DoublyNode(String value) {
        this.value = value;
        previous = next = null;
    }

    public DoublyNode(String value, DoublyNode previous, DoublyNode next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }

    public DoublyNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyNode previous) {
        this.previous = previous;
    }

    public DoublyNode getNext() {
        return next;
    }

    public void setNext(DoublyNode next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
