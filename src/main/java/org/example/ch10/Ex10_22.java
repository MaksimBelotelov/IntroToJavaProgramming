package org.example.ch10;

import java.util.Arrays;

/*
(Implement the String class) The String class is provided in the Java library.
Provide your own implementation for the following methods (name the new
class MyString1):

public MyString1(char[] chars);
public char charAt(int index);
public int length();
public MyString1 substring(int begin, int end);
public MyString1 toLowerCase();
public boolean equals(MyString1 s);
public static MyString1 valueOf(int i);

*/
public class Ex10_22 {
    public static void main(String[] args) {
        MyString1 ms1 = MyString1.valueOf(1234);
    }
}

class MyString1 {
    private char[] characters;

    public MyString1(char[] chars) {
        characters = new char[chars.length];
        System.arraycopy(chars, 0, characters, 0, chars.length);
    }

    public char charAt(int index) {
        return characters[index];
    }

    public int length() {
        return characters.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] chars = new char[end - begin];
        System.arraycopy(this.characters, begin, chars, 0, end - begin);
        return new MyString1(chars);
    }

    public MyString1 toLowerCase() {
        char[] chars = new char[this.length()];
        for (int i = 0; i < chars.length; i++)
            chars[i] = Character.toLowerCase(this.characters[i]);
        return new MyString1(chars);
    }

    public boolean equals(MyString1 s) {
        if (this.characters.length != s.characters.length)
            return false;
        for (int i = 0; i < this.length(); i++)
            if (this.characters[i] != s.characters[i])
                return false;
        return true;
    }

    public static MyString1 valueOf(int i) {
        char[] chars = new char[10];
        int len = 0;
        while (i > 0) {
            int digit = i % 10;
            i /= 10;
            chars[len++] = (char)(digit + '0');
        }

        char[] resChars = new char[len];
        for (int j = len - 1; j >= 0; j--)
            resChars[len - j - 1] = chars[j];

        return new MyString1(resChars);
    }
}
