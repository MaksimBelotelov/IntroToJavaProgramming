package org.example.ch20;

/*
(Postfix notation) Postfix notation is a way of writing expressions without using
parentheses. For example, the expression (1 + 2) * 3 would be written as
1 2 + 3 *. A postfix expression is evaluated using a stack. Scan a postfix
expression from left to right. A variable or constant is pushed into the stack.
When an operator is encountered, apply the operator with the top two operands
in the stack and replace the two operands with the result.
 */

import java.util.Stack;

public class Ex20_14 {
    public static void main(String[] args) {
        String input = args[0];
        Stack<Integer> operandStack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isDigit(currentChar)) {
                StringBuilder sbCurrentNum = new StringBuilder();
                sbCurrentNum.append(currentChar);

                while (Character.isDigit(currentChar = input.charAt(++i)))
                    sbCurrentNum.append(currentChar);

                int currentNum = Integer.parseInt(sbCurrentNum.toString());

                operandStack.push(currentNum);
            }
            else if (!Character.isSpaceChar(currentChar)) {
                int n2 = operandStack.pop();
                int n1 = operandStack.pop();

                switch (currentChar) {
                    case '+':
                        operandStack.push(n1 + n2);
                        break;
                    case '-':
                        operandStack.push(n1 - n2);
                        break;
                    case '*':
                        operandStack.push(n1 * n2);
                        break;
                    case '/':
                        operandStack.push(n1 / n2);
                        break;
                    default:
                        System.out.println("Error: Invalid expression");
                        System.exit(1);
                }
            }
        }
        int result = operandStack.pop();
        if (operandStack.isEmpty())
            System.out.println("Result: " + result);
        else
            System.out.println("Invalid expression");
    }
}
