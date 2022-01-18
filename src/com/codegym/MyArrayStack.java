package com.codegym;

import java.util.Arrays;

public class MyArrayStack<T> {
    private final int DEFAULT_CAPACITY = 4;
    private T[] array = (T[]) new Object[DEFAULT_CAPACITY];
    private int size = 0;

    public MyArrayStack() {
    }

    public void push(T element) {
        ensureCapacity();
        size++;
        array[size - 1] = element;
    }

    public T pop() {
        if (size ==0)
            return null;
        size--;
        return array[size];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (size == array.length)
            expandArray();
    }

    private void expandArray() {
        array = Arrays.copyOf(array, array.length + DEFAULT_CAPACITY);
    }
}
