package org.example.ch10;

public class Ex10_26 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < args[0].length(); i++) {
            if (args[0].charAt(i) == ' ') continue;
            if (args[0].charAt(i) == '+' ||
                    args[0].charAt(i) == '-' ||
                    args[0].charAt(i) == '*' ||
                    args[0].charAt(i) == '/' ||
                    args[0].charAt(i) == '=') {

                sb.append(" " + args[0].charAt(i) + " ");
            } else {
                sb.append(args[0].charAt(i));
            }
        }

        String normalString = sb.toString();
        String[] tokens = normalString.split("\\s+");
        int result = 0;

        switch (tokens[1].charAt(0)) {
            case '+': result = Integer.parseInt(tokens[0]) +
                    Integer.parseInt(tokens[2]);
                    break;
            case '-': result = Integer.parseInt(tokens[0]) -
                    Integer.parseInt(tokens[2]);
                    break;
            case '*': result = Integer.parseInt(tokens[0]) *
                    Integer.parseInt(tokens[2]);
                    break;
            case '/': result = Integer.parseInt(tokens[0]) /
                    Integer.parseInt(tokens[2]);
                    break;
        }

        System.out.println(tokens[0] + ' ' + tokens[1] + ' ' + tokens[2]
                + " = " + result);
    }
}
