package org.example.ch12;

public class Ex12_1_2 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        int result = 0;

        if (!isOnlyDigits(args[0])) {
            System.out.println("Wrong input: " + args[0]);
            System.exit(1);
        }
        if (!isOnlyDigits(args[2])) {
            System.out.println("Wrong input: " + args[2]);
            System.exit(1);
        }

        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) +
                        Integer.parseInt(args[2]);
                break;
            case '-':
                result = Integer.parseInt(args[0]) -
                        Integer.parseInt(args[2]);
                break;
            case '.':
                result = Integer.parseInt(args[0]) *
                        Integer.parseInt(args[2]);
                break;
            case '/':
                result = Integer.parseInt(args[0]) /
                        Integer.parseInt(args[2]);
        }

        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                + " = " + result);
    }

    public static boolean isOnlyDigits(String number) {
        for (int i = 0; i < number.length(); i++)
            if (!Character.isDigit(number.charAt(i)))
                return false;
        return true;
    }
}
