package org.example.other;

class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }

    public static boolean isPalindrome(int x) {
        int inp = x;
        int rev = 0;
        while (inp > 0) {
            rev *= 10;
            rev += inp % 10;
            inp /= 10;
        }

        return rev == x;
    }
}


