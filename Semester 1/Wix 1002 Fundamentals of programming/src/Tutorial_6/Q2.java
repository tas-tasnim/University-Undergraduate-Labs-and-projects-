package Tutorial_6;

import java.util.Scanner;

/*
 * WIX1002 Fundamentals of Programming - Tutorial 6 (Java Methods), Question 2
 * A method that displays three numbers in decreasing order.
 */
public class Q2 {

    // Sorts the three values with swaps, then prints them largest first
    public static void displayDecreasing(int a, int b, int c) {
        int t;
        if (a < b) { t = a; a = b; b = t; }
        if (a < c) { t = a; a = c; c = t; }
        if (b < c) { t = b; b = c; c = t; }
        System.out.println("Decreasing order: " + a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        displayDecreasing(a, b, c);
    }
}
