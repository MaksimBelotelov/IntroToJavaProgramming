package org.example.ch5;
/*
    (Conversion from kilograms to pounds and pounds to kilograms) Write a program
    that displays the following two tables side by side:
 */
public class Ex5_5 {
    public static void main(String[] args) {
        System.out.printf("%10s%10s" + "  |  " + "%-10s%10s", "Kilograms", "Pounds", "Pounds", "Kilograms\n");
        for(int k = 1, p = 20; k <= 199; k += 2, p += 5) {
            System.out.printf("%-10d%10.1f" + "  |  " + "%-10d%10.2f\n", k, k * 2.2, p, p / 2.2);
        }
    }
}
