package com.omaralbeik.stack;

/**
 * Created by omar on 28/12/2016.
 */
public class LinkedListStack {

    private StackNode top;

    public LinkedListStack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        StackNode current = top;
        int count = 0;
        while (current != null) {
            current = current.getNext();
            count++;
        }
        return count;
    }

    public void initializeStack() {
        top = null;
    }

    public void push(int value) {
        StackNode node = new StackNode(value);
        node.setNext(top);
        top = node;
    }

    public boolean pop() {
        if (isEmpty())
            return false;
        top = top.getNext();
        return true;
    }

    public int top() {
        assert (top == null); // terminate the program if the stack is empty
        return top.getValue();
    }

    public void outputStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        StackNode current = top;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public void copy(LinkedListStack anotherStack) {
        top = anotherStack.top;
    }

    public boolean equals(LinkedListStack anotherStack) {
        return top == anotherStack.top;
    }


}
