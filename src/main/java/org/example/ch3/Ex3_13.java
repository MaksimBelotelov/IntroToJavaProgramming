package org.example.ch3;

import java.util.Scanner;

/*

 */
public class Ex3_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("(0-single filer, 1-married jointly or " +
                "qualifying widow(er), 2-married separately, 3-head of " +
                "household) Enter the filing status: ");
        int status = scanner.nextInt();
        System.out.print("Enter the taxable income: ");
        double income = scanner.nextDouble();
        double tax = 0;

        switch (status) {
            case 0:
                tax = calculateTax(8350, 33950, 82250, 171550, 372950, income);
                break;
            case 1:
                tax = calculateTax(16700, 67900, 137050, 208850, 372950, income);
                break;
            case 2:
                tax = calculateTax(8350, 33950, 68525, 104425, 186475, income);
                break;
            case 3:
                tax = calculateTax(11950, 45500, 117450, 190200, 372950, income);
                break;
            default:
                System.out.println("Error: invalid status");
                System.exit(1);
        }

        System.out.println("Tax is " + (int)(tax * 100) / 100.0);
    }

    public static double calculateTax(double aRate, double bRate, double cRate,
                                    double dRate, double eRate, double income) {

        double tax = 0;
        if  (income <= aRate)
            tax = income * 0.10;
        else if (income <= bRate)
            tax = aRate * 0.10 + (income - aRate) * 0.15;
        else if (income <= cRate)
            tax = aRate * 0.10 + (bRate - aRate) * 0.15 + (income - bRate) * 0.25;
        else if (income <= dRate)
            tax = aRate * 0.10 + (bRate - aRate) * 0.15 + (cRate - bRate) * 0.25 +
                    (income - cRate) * 0.28;
        else if (income <= eRate)
            tax = aRate * 0.10 + (bRate - aRate) * 0.15 + (cRate - bRate) * 0.25 +
                    (dRate - cRate) * 0.28 + (income - dRate) * 0.33;
        else
            tax = aRate * 0.10 + (bRate - aRate) * 0.15 +
                    (cRate - bRate) * 0.25 + (dRate - cRate) * 0.28 +
                    (eRate - dRate) * 0.33 + (income - eRate) * 0.35;
        return tax;
    }
}
