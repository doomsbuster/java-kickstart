package com.stevens.cs.l1;

/**
  * Exercise 1: Create a class that adds all even numbers from 2 to 200, excluding numbers that are multiples of 7.
 */
public class SumOfNumbers {
    private static final int START = 2;
    private static final int END = 200;
    private static final int EXCLUDES = 7;

    public static void main(String[] args) {
        SumOfNumbers numbers = new SumOfNumbers();
        int sum = numbers.getSum();
        System.out.println(sum);
    }

    public int getSum() {
        int i = START;
        int sum = 0;
        while (i <= END) {
            if (i % START == 0 && !(i % EXCLUDES == 0)) sum += i;
            i++;
        }
        return sum;
    }
}
