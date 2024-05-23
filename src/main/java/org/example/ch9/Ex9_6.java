package org.example.ch9;

import java.util.Random;

/*
(Stopwatch) Design a class named StopWatch. The class contains:
■■ Private data fields startTime and endTime with getter methods.
■■ A no-arg constructor that initializes startTime with the current time.
■■ A method named start() that resets the startTime to the current time.
■■ A method named stop() that sets the endTime to the current time.
■■ A method named getElapsedTime() that returns the elapsed time for the
stopwatch in milliseconds.
 */

public class Ex9_6 {
    public static void main(String[] args) {
        int[] inputArray = new int[100000];
        Random random = new Random();
        for (int i = 0; i < 100000; i++)
            inputArray[i] = random.nextInt();
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        selectionSort(inputArray);
        stopwatch.stop();
        System.out.println("Elapsed time: " + stopwatch.getElapsedTime() + "ms");
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] <= arr[i]) {
                    min = arr[j];
                    indexMin = j;
                }
            }
            arr[indexMin] = arr[i];
            arr[i] = min;
        }
    }
 }

class Stopwatch {
    private long startTime;
    private long endTime;

    public Stopwatch() {
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
