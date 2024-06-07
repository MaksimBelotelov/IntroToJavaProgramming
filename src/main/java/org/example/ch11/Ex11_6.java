package org.example.ch11;

import java.util.ArrayList;
import java.util.List;

/*
(Use ArrayList) Write a program that creates an ArrayList and adds a Loan
object, a Date object, a string, and a Circle object to the list, and use a loop to
display all the elements in the list by invoking the object’s toString() method.
 */
public class Ex11_6 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(new MyDate());
        list.add(new Circle2D());
        list.add("Preved");
        list.add(new SavingsAccount(123, 2.0, 3.1));

        for (Object item : list)
            System.out.println(item);
    }
}
