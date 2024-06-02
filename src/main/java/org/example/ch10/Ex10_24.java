package org.example.ch10;

/*
(Implement the Character class) The Character class is provided in the Java
library. Provide your own implementation for this class. Name the new class
MyCharacter.
 */

public class Ex10_24 {
    public static void main(String[] args) {
        MyCharacter c = new MyCharacter('C');
        MyCharacter a = new MyCharacter('A');
        System.out.println("isLetter test: " + c.isLetter());
        System.out.println("isDigit test: " + c.isDigit());
        System.out.println("compare test: " + c.compare(a));
    }
}

class MyCharacter {
    private char value;

    public MyCharacter(char c) {
        this.value = c;
    }

    public int compare(MyCharacter ch) {
        return value - ch.value;
    }

    public boolean isDigit() {
        return value >= '0' && value <= '9';
    }

    public boolean isLetter() {
        return (value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z');
    }
}
