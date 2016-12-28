package com.omaralbeik.stack;

/**
 * Created by omar on 28/12/2016.
 */
public class Stack {

    private int[] array;
    private int size;
    private int top;

    public int peek() {
        assert (top == 0); // terminate the program if stack is empty.
        return array[top - 1];
    }

    public Stack() {
        size = 10;
        array = new int[size];
        top = 0;
    }

    public Stack(int size) {
        this.size = (size <= 0) ? 10 : size;
        array = new int[this.size];
        top = 0;
    }

    public Stack(Stack anotherStack) {
        copy(anotherStack);
    }

    public void initializeStack() {
        top = 0;
        array = new int[size];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == size;
    }

    public boolean push(int value) {
        if (isFull())
            return false;
        array[top] = value;
        top++;
        return true;
    }

    public boolean pop() {
        if (isEmpty())
            return false;
        top--;
        return true;
    }

    public void copy(Stack anotherStack) {
        size = anotherStack.size;
        top = anotherStack.top;
        array = new int[size];
        for (int i = 0; i < top; i++)
            array[i] = anotherStack.array[i];
    }

    public boolean equals(Stack anotherStack) {
        if (size != anotherStack.size)
            return false;
        for (int i = 0; i < size; i++) {
            if (array[i] != anotherStack.array[i])
                return false;
        }
        return true;
    }

    public void outputStack() {
        if (top == 0) {
            System.out.println("Stack is empty!");
            return;
        }
        for (int i = top - 1; i >= 0; i--)
            System.out.println(array[i]);
    }

}
