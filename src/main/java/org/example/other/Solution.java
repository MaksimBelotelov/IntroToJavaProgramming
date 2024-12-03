package org.example.other;

class Solution {
    public static void main(String[] args) {
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for (String current : operations) {
            if (current.startsWith("++") || current.endsWith("++"))
                x++;
            else
                x--;
        }

        return x;
    }
}


