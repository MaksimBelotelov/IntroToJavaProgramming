package org.example.ch10;

public class Ex10_3 {
    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(1);
        MyInteger n2 = new MyInteger(2);
        MyInteger n3 = new MyInteger(3);
        MyInteger n4 = new MyInteger(4);
        MyInteger n5 = new MyInteger(1);

        System.out.println(n2.isOdd());
        System.out.println(n3.isEven());
        System.out.println(n4.isPrime());
        System.out.println(n1.equals(n5));
        System.out.println(n1.equals(n2));
        System.out.println(MyInteger.parseInt(new char[]{'1', '2', '3'}));
        System.out.println(MyInteger.parseInt("321"));
    }
}

class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static boolean isPrime(int n) {
        for (int divisor = 2; divisor <= n / 2; divisor++) {
            if (n % divisor == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return isEven(myInteger.getValue());
    }

    public static boolean isOdd(MyInteger myInteger) {
        return isOdd(myInteger.getValue());
    }

    public static boolean isPrime(MyInteger myInteger) {
        return isPrime(myInteger.getValue());
    }

    public boolean equals(int n) {
        return value == n;
    }

    public boolean equals(MyInteger myInteger) {
        return myInteger.getValue() == value;
    }

    public static int parseInt(char[] array) {
        String str = new String(array);
        return Integer.parseInt(str);
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }
}