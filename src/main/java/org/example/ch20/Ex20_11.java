package org.example.ch20;

/*
(Match grouping symbols) A Java program contains various pairs of grouping
symbols, such as:
■■ Parentheses: ( and )
■■ Braces: { and }
■■ Brackets: [ and ]
Note the grouping symbols cannot overlap. For example, (a{b)} is illegal.
Write a program to check whether a Java source-code file has correct pairs of
grouping symbols. Pass the source-code file name as a command-line argument.
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Ex20_11 {
    public static void main(String[] args) {
        File file = new File("Input.txt");
        Stack<Character> stack = new Stack<>();
        int line = 0;

        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()) {
                line++;
                char[] string = scanner.nextLine().toCharArray();
                char gs;
                for (var ch: string) {
                    if (ch == '(' || ch == '{' || ch == '[')
                        stack.push(ch);
                    else if (ch == ')' || ch == '}' || ch == ']') {
                        if (!stack.isEmpty()) {
                            gs = stack.pop();
                            if ((gs == '(' && ch != ')' ) ||
                                (gs == '{' && ch != '}') ||
                                 gs == '[' && ch != ']') {
                                System.out.println("Error in line " + line);
                                break;
                            }
                        }
                    }
                }
            }
            if (!stack.isEmpty())
                System.out.println("Error in brackets matching");
            else
                System.out.println("Looks everything fine...");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
