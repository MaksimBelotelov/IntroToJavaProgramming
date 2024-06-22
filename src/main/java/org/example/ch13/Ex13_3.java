package org.example.ch13;

/*
(Sort ArrayList) Write the following method that sorts an ArrayList of numbers:

public static void sort(ArrayList<Number> list)

*/

import java.util.ArrayList;

public class Ex13_3 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(22);
        list.add(13);
        list.add(34);
        list.add(76);
        list.add(1);
        sort(list);
        System.out.println(list);
    }

    public static int partition(ArrayList<Number> list, int left, int right) {
        while (left < right) {
            double pivot = list.get((left + right) / 2).doubleValue();
            while (list.get(left).doubleValue() < pivot) left++;
            while (list.get(right).doubleValue() > pivot) right--;
            if (left <= right) {
                Number temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void sort(ArrayList<Number> list, int start, int end) {
        if (start >= end) return;
        int rightStart = partition(list, start, end);
        sort(list, start, rightStart - 1);
        sort(list, rightStart, end);
    }

    public static void sort(ArrayList<Number> list) {
        sort(list, 0, list.size() - 1);
    }
}