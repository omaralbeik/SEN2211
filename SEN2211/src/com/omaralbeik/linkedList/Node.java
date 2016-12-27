package com.omaralbeik.linkedList;

/**
 * Created by omar on 27/12/2016.
 */
public class Node {

    private String value;
    private Node next;

    public Node() {
        value = null;
        next = null;
    }

    public Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node(String value) {
        this.value = value;
        next = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
