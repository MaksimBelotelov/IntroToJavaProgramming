package org.example.ch4;

/*
    (Financial application: payroll) Write a program that reads the following information
    and prints a payroll statement:
    Employee’s name (e.g., Smith)
    Number of hours worked in a week (e.g., 10)
    Hourly pay rate (e.g., 9.75)
    Federal tax withholding rate (e.g., 20%)
    State tax withholding rate (e.g., 9%)
 */

import java.util.Scanner;

public class Ex4_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        int hoursPerWeek = scanner.nextInt();
        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = scanner.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = scanner.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = scanner.nextDouble();
        double gross = hoursPerWeek * hourlyPayRate;
        double federal = gross * federalTax;
        double state = gross * stateTax;

        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hoursPerWeek);
        System.out.println("Pay Rate: $" + hourlyPayRate);
        System.out.println("Gross Pay: $" + gross);
        System.out.println("Deductions:\n\tFederal Withholding (20.0%): $" + federal);
        System.out.println("\tState Withholding (9.0%): $" + state);
        System.out.println("\tTotal Deduction: $" + (federal + state));
        System.out.printf("Net Pay: $%.2f", (gross - federal - state));
    }
}
