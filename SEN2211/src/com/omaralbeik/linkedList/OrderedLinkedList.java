package com.omaralbeik.linkedList;

/**
 * Created by omar on 28/12/2016.
 */
public class OrderedLinkedList {

    private Node head;
    private Node tail;

    public OrderedLinkedList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insert(String value) {
        if (isEmpty()) { // list is empty.
            head = tail = new Node(value);
            return;
        }
        // list is not empty
        Node current = head;
        Node previous = new Node();
        Node newNode = new Node(value);
        while (current != null) {
            if (current.getValue().compareTo(value) > 0) { // value should be inserted before current.
                if (current == head) { // insert before head.
                    newNode.setNext(head);
                    head = newNode;
                    break;
                } else {
                    previous.setNext(newNode);
                    newNode.setNext(current);
                    break;
                }
            } else if (current == tail) { // insert after tail
                tail.setNext(newNode);
                newNode.setNext(null);
                tail = newNode;
            }
            previous = current;
            current = current.getNext();
        }
    }

    public void outputList() {
        if (isEmpty())
            System.out.println("List is empty!");
        else {
            Node current = head;
            while (current != null) {
                System.out.println(current.getValue());
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
