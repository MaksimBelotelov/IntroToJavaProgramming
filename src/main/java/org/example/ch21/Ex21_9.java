package org.example.ch21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex21_9 {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>(Map.of("Germany", "Berlin",
                "England", "London", "Turkey", "Ankara"));

        Scanner scanner = new Scanner(System.in);
        String state;
        System.out.print("Enter state: ");
        while (!(state = scanner.nextLine()).isBlank()) {
            if (countries.containsKey(state))
                System.out.println(" " + countries.get(state));
            else
                System.out.println("I don't know such country =(");
        }
    }
}
