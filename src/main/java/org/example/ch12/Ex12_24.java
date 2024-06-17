package org.example.ch12;

/*
(Create large dataset) Create a data file with 1,000 lines. Each line in the file
consists of a faculty member’s first name, last name, rank, and salary. The
faculty member’s first name and last name for the ith line are FirstNamei and
LastNamei. The rank is randomly generated as assistant, associate, and full.
The salary is randomly generated as a number with two digits after the decimal
point. The salary for an assistant professor should be in the range from 50,000
to 80,000, for associate professor from 60,000 to 110,000, and for full professor
from 75,000 to 130,000. Save the file in Salary.txt. Here are some sample data:

FirstName1 LastName1 assistant 60055.95
FirstName2 LastName2 associate 81112.45
. . .
FirstName1000 LastName1000 full 92255.21
*/

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex12_24 {
    public static void main(String[] args) throws FileNotFoundException {
        String[] ranks = {"assistant", "associate", "full"};

        try (PrintWriter printWriter = new PrintWriter("Salary.txt")) {
            for (int i = 0; i < 1000; i++) {
                int currentRank = (int)(Math.random() * 3);
                printWriter.printf("FirstName%d LastName%d %s %.2f\n", i, i, ranks[currentRank],
                        generateSalary(ranks[currentRank]));
            }
        }
    }

    public static double generateSalary(String rank) {
        switch (rank) {
            case "assistant" -> {
                return 50000 + (Math.random() * 30000);
            }
            case "associate" -> {
                return 60000 + (Math.random() * 50000);
            }
            case "full" -> {
                return 75000 + (Math.random() * 55000);
            }
            default -> {
                System.out.println("Error! Wrong rank");
                return -1;
            }
        }
    }
}
