package org.example.ch10;
/*
(Implement the String class) The String class is provided in the Java library.
Provide your own implementation for the following methods (name the new
class MyString2):
public MyString2(String s);
public int compare(String s);
public MyString2 substring(int begin);
public MyString2 toUpperCase();
public char[] toChars();
public static MyString2 valueOf(boolean b);
 */
public class Ex10_23 {
    public static void main(String[] args) {
        MyString2 ms1 = new MyString2("123");
        String s = "103";
        System.out.println(ms1.compare(s));
    }
}

class MyString2 {
    private char[] characters;

    public MyString2(String s) {
        characters = s.toCharArray();
    }

    public int compare(String s) {
        char[] stringCharacters = s.toCharArray();
        int len = (Math.min(characters.length, stringCharacters.length));

        for (int i = 0; i < len; i++)
            if (characters[i] != stringCharacters[i])
                return characters[i] - stringCharacters[i];

        return characters.length - stringCharacters.length;
    }

    public MyString2 substring(int begin) {
        char[] chars = new char[characters.length - begin];
        System.arraycopy(characters, begin, chars, 0, chars.length);
        return new MyString2(new String(chars));
    }

    public MyString2 toUpperCase() {
        char[] resChars = new char[this.characters.length];
        for (int i = 0; i < resChars.length; i++)
            resChars[i] = Character.toUpperCase(characters[i]);
        return new MyString2(new String(resChars));
    }

    public char[] toChars() {
        char[] chars = new char[this.characters.length];
        System.arraycopy(characters, 0, chars, 0, characters.length);
        return chars;
    }

    public static MyString2 valueOf(boolean b) {
        return b ? new MyString2("true") : new MyString2("false");
    }
}
