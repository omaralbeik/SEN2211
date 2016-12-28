package com.omaralbeik.stack;

/**
 * Created by omar on 28/12/2016.
 */
public class StackNode {

    private int value;
    private StackNode next;

    public StackNode() {
        value = 0;
        next = null;
    }

    public StackNode(int value) {
        this.value = value;
        next = null;
    }

    public StackNode(int value, StackNode next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public StackNode getNext() {
        return next;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }
}
