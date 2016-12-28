package com.omaralbeik.linkedList;

/**
 * Created by omar on 28/12/2016.
 */
public class OrderedDoublyLinkedList {

    private DoublyNode head;
    private DoublyNode tail;

    public OrderedDoublyLinkedList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        DoublyNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    public void insert(String value) {
        if (isEmpty())
            head = tail = new DoublyNode(value);
        else {
            DoublyNode current = head;
            DoublyNode node = new DoublyNode(value);
            while (current != null) {
                if (current.getValue().compareTo(value) > 0) { // value should be inserted before current.
                    if (current == head) { // should insert before head
                        node.setNext(head);
                        head.setPrevious(node);
                        head = node;
                        break;
                    } else {
                        node.setPrevious(current.getPrevious());
                        node.setNext(current);
                        current.setPrevious(node);
                        break;
                    }
                } else if (current == tail) { // insert after tail
                    tail.setNext(node);
                    node.setPrevious(tail);
                    tail = node;
                    break;
                }
                current = current.getNext();
            }
        }
    }

    public DoublyNode remove(String value) {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return null;
        }
        DoublyNode current = head;
        while (current != null) {
            if (current.getValue().equals(value)) {
                if (current == head) { // should remove head
                    if (head == tail) { // list has only 1 node
                        DoublyNode node = head;
                        head = tail = null;
                        return node;
                    } else { // list has more than 1 node
                        DoublyNode node = head;
                        head = head.getNext();
                        head.setPrevious(null);
                        return node;
                    }
                } else if (current == tail) { // should remove tail
                    DoublyNode node = tail;
                    tail = tail.getPrevious();
                    tail.setNext(null);
                    return node;
                } else { // current is in between head and tail
                    DoublyNode node = current;
                    current.getPrevious().setNext(current.getNext());
                    current.getNext().setPrevious(current.getPrevious());
                    return node;
                }
            }
        }
        return null; // no node with the given value was found.
    }

    public DoublyNode find(String value) {
        DoublyNode current = new DoublyNode();
        boolean isGoingForward = true;
        if (value.charAt(0) < 'M') { // in the first half of alphabets
            current = head;
        } else { // in the second half of alphabets
            current = tail;
            isGoingForward = false;
        }
        while (current != null) {
            if (current.getValue().equals(value))
                return current;
            current = (isGoingForward) ? current.getNext() : current.getPrevious();
        }
        return null;
    }

    public DoublyNode nodeAtIndex(int index) {
        DoublyNode current = head;
        int currentIndex = 0;
        while (current != null) {
            if (index == currentIndex)
                return current;
            currentIndex++;
            current = current.getNext();
        }
        return  null; // no node was found at the given index;
    }

    public void outputList() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        DoublyNode current = head;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public void outputListBackward() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        DoublyNode current = tail;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getPrevious();
        }
    }

}
