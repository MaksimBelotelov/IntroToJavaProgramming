package org.example.ch20;

/*
(Convert infix to postfix) Write a method that converts an infix expression into
a postfix expression using the following header:

public static String infixToPostfix(String expression)

For example, the method should convert the infix expression (1 + 2) * 3
to 1 2 + 3 * and 2 * (1 + 3) to 2 1 3 + *. Write a program that accepts
an expression in one argument from the command line and displays its corresponding
postfix expression.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Ex20_16 {
    public static void main(String[] args) {
        String expression = args[0];
        System.out.println(infixToPostfix(expression));
    }

    public static String infixToPostfix(String input) {
        Stack<Character> operatorStack = new Stack<>();
        List<Object> res = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isDigit(currentChar)) {
                StringBuilder sbCurrentNum = new StringBuilder();

                do {
                    sbCurrentNum.append(currentChar);
                    i++;
                } while (i < input.length() && Character.isDigit(currentChar = input.charAt(i)));

                int currentNum = Integer.parseInt(sbCurrentNum.toString());

                res.add(currentNum);
            }
            if (currentChar == '(')
                operatorStack.push('(');

            else if (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/' ||
                     currentChar == ')') {

                if (operatorStack.isEmpty() || operatorStack.peek() == '(' ||
                        ((currentChar == '*' || currentChar == '/') &&
                                (operatorStack.peek() == '+' || operatorStack.peek() == '-')))
                        operatorStack.push(currentChar);

                else {
                    while (!operatorStack.isEmpty() && operatorStack.peek() != '(')
                        res.add(operatorStack.pop());

                    if (!operatorStack.isEmpty() && operatorStack.peek() == '(')
                        operatorStack.pop();

                    if (currentChar != ')') operatorStack.push(currentChar);
                }
            }
        }
        while (!operatorStack.isEmpty() && operatorStack.peek() != '(')
            res.add(operatorStack.pop());

        StringBuilder result = new StringBuilder();
        for (var item: res) {
            result.append(item);
            result.append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}
