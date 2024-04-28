package org.example.ch5;

/*
    (Conversion from miles to kilometers) Write a program that displays the follow-
    ing two tables side by side:
 */

public class Ex5_6 {
    public static void main(String[] args) {
        System.out.printf("%10s%10s" + "  |  " + "%-10s%10s", "Miles", "Kilometers", "Kilometers", "Miles\n");
        for(int k = 1, p = 20; k <= 10; k++, p += 5) {
            System.out.printf("%-10d%10.3f" + "  |  " + "%-10d%10.3f\n", k, k * 1.609, p, p / 1.609);
        }
    }
}
