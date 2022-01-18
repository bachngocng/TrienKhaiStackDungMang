package com.codegym;

public class Main {

    public static void main(String[] args) {
        MyArrayStack<Integer> stack = new MyArrayStack<>();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);

        while(!stack.isEmpty()){
            System.out.println("stack size: " + stack.size());
            System.out.println("stack pop: " + stack.pop());
        }

        System.out.println("stack pop: " + stack.pop()); // null

    }
}
