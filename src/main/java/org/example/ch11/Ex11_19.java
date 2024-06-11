package org.example.ch11;

/*
(Bin packing using first fit) The bin packing problem is to pack the objects of various
weights into containers. Assume each container can hold a maximum of 10
pounds. The program uses an algorithm that places an object into the first bin in
which it would fit. Your program should prompt the user to enter the total number
of objects and the weight of each object. The program displays the total number
of containers needed to pack the objects and the contents of each container.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of objects: ");
        int numberOfObjects = scanner.nextInt();
        ArrayList<Integer> weights = new ArrayList<>(numberOfObjects);

        System.out.print("Enter the weights of the objects: ");
        for (int i = 0; i < numberOfObjects; i++)
            weights.add(scanner.nextInt());

        ArrayList<ArrayList<Integer>> containers = new ArrayList<>();

        for (Integer weight : weights) {
            boolean placed = false;
            for (ArrayList<Integer> item : containers) {
                if (containerSum(item) + weight <= 10) {
                    item.add(weight);
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                containers.add(new ArrayList<>());
                containers.get(containers.size() - 1).add(weight);
            }
        }

        for (int i = 0; i < containers.size(); i++) {
            System.out.printf("Container %d contains objects with weight ", i + 1);
            for (Integer weight : containers.get(i))
                System.out.print(weight + " ");
            System.out.println();
        }
        System.out.println("You need " + containers.size() + " containers");
    }

    public static int containerSum(ArrayList<Integer> container) {
        int result = 0;
        for (Integer item : container)
            result += item;

        return result;
    }
}
