package org.example.ch5;

/*
(Math: combinations) Write a program that displays all possible combinations
for picking two numbers from integers 1 to 7. Also display the total number of
all combinations.
 */
public class Ex5_43 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i < 7; i++) {
            for(int j = i + 1; j < 8; j++) {
                System.out.println(i + " " + j);
                counter++;
            }
        }
        System.out.println("The total number of all combination is " + counter);
    }
}
