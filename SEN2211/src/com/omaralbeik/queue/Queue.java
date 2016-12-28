package com.omaralbeik.queue;

/**
 * Created by omar on 28/12/2016.
 */
public class Queue {

    private int[] array;
    private int size;
    private int front;
    private int rear;
    private int count;

    public Queue() {
        size = 10;
        array = new int[size];
        front = 0;
        rear = size - 1;
        count = 0;
    }

    public Queue(int size) {
        this.size = (size <= 0) ? 10 : size;
        array = new int[this.size];
        front = 0;
        rear = this.size - 1;
        count = 0;
    }

    public void initializeQueue() {
        front = 0;
        rear = size - 1;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

    public int getFront() {
        assert(!isEmpty());
        return array[front];
    }

    public int getRear() {
        assert(!isEmpty());
        return array[rear];
    }

    public void add(int value) {
        assert(!isFull());
        rear = (rear + 1) % size;
        count++;
        array[rear] = value;
    }

    public int remove() {
        assert(!isEmpty());
        int number = array[front];
        front = (front + 1) % size;
        count--;
        return number;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
