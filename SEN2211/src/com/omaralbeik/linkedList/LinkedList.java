package com.omaralbeik.linkedList;

/**
 * Created by omar on 27/12/2016.
 */
public class LinkedList {

    private Node head;
    private Node tail;

    public LinkedList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        if (isEmpty())
            return 0;
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    public void prepend(String value) {
        if (isEmpty())
            head = tail = new Node(value);
        else
            head = new Node(value, head);
    }

    public void append(String value) {
        if (isEmpty())
            head = tail = new Node(value);
        else {
            tail.setNext(new Node(value));
            tail = tail.getNext();
        }
    }

    public Node shift() {
        if (isEmpty()) { // list is empty
            System.out.println("linkList is empty!");
            return null;
        } else if (head == tail) { // list has only one node
            Node node = head;
            head = tail = null;
            return node;
        } else {
            Node node = head;
            head = head.getNext();
            return node;
        }
    }

    public Node pop() {
        if (isEmpty()) {
            System.out.println("linkList is empty!");
            return null;
        } else if (head == tail) {
            Node node = tail;
            head = tail = null;
            return node;
        } else {
            Node current = head;
            Node node = tail;
            while (current.getNext() != null)
                current = current.getNext();
            current.setNext(null);
            tail = current;
            return node;
        }
    }

    public void outputList() {
        if (isEmpty())
            System.out.println("List is empty!");
        else {
            Node current = head;
            while (current != null) {
                System.out.println(head.getValue());
                current = current.getNext();
            }
        }
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
}
