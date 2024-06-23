package org.example.ch13;

import java.util.ArrayList;

/*
(Revise the MyStack class) Rewrite the MyStack class in Listing 11.10 to perform
a deep copy of the list field.
 */

public class Ex13_8 {
    public static void main(String[] args) {
        MyStack stack1 = new MyStack();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        MyStack stack2 = (MyStack)(stack1.clone());

        System.out.println("stack1 == stack2: " + (stack1 == stack2));
        System.out.println(stack1);
        System.out.println(stack2);
    }
}

class MyStack implements Cloneable {

    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

    @Override
    public Object clone() {
        try {
            MyStack stackClone = (MyStack) super.clone();
            stackClone.list = (ArrayList<Object>) (list.clone());
            return stackClone;
        }
        catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}