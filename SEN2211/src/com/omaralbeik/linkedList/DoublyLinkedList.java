package com.omaralbeik.linkedList;

/**
 * Created by omar on 28/12/2016.
 */
public class DoublyLinkedList {

    private DoublyNode head;
    private DoublyNode tail;

    public DoublyLinkedList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        DoublyNode current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    public void prepend(String value) {
        if (isEmpty())
            head = tail = new DoublyNode(value);
        else {
            DoublyNode node = new DoublyNode(value, null, head);
            head.setPrevious(node);
            head = node;
        }
    }

    public void append(String value) {
        if (isEmpty())
            head = tail = new DoublyNode(value);
        else {
            DoublyNode node = new DoublyNode(value, tail, null);
            tail.setNext(node);
            tail = node;
        }
    }

    public DoublyNode shift() {
        if (isEmpty()) { // list is empty
            System.out.println("list is empty!");
            return null;
        } else if (head == tail) { // list has only one node
            DoublyNode node = head;
            head = tail = null;
            return node;
        } else {
            DoublyNode node = head;
            head = head.getNext();
            head.setPrevious(null);
            return node;
        }
    }

    public DoublyNode pop() {
        if (isEmpty()) { // lis tis empty
            System.out.println("list is empty");
            return null;
        } else if (head == tail) { // list has only one node
            DoublyNode node = tail;
            head = tail = null;
            return node;
        } else {
            DoublyNode node = tail;
            tail = tail.getPrevious();
            tail.setNext(null);
            return node;
        }
    }

    public DoublyNode find(String value) {
        DoublyNode current = head;
        while (current != null) {
            if (current.getValue().equals(value))
                return current;
            current = current.getNext();

        }
        return null;
    }

    public boolean contains(String value) {
        return find(value) != null;
    }

    public void outputList() {
        if (isEmpty())
            System.out.println("List is empty!");
        else {
            DoublyNode current = head;
            while (current != null) {
                System.out.println(current.getValue());
                current = current.getNext();
            }
        }
    }

    public void outputListBackward() {
        if (isEmpty())
            System.out.println("List is empty!");
        else {
            DoublyNode current = tail;
            while (current != null) {
                System.out.println(current.getValue());
                current = current.getPrevious();
            }
        }
    }

    public DoublyNode getHead() {
        return head;
    }

    public void setHead(DoublyNode head) {
        this.head = head;
    }

    public DoublyNode getTail() {
        return tail;
    }

    public void setTail(DoublyNode tail) {
        this.tail = tail;
    }
}
