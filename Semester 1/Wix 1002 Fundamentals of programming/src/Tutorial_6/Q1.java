package Tutorial_6;

import java.util.Random;

/*
 * WIX1002 Fundamentals of Programming - Tutorial 6 (Java Methods), Question 1 (a - h)
 * Each part is one static method; main() shows each one working.
 */
public class Q1 {

    // a. Maximum of 3 integers
    public static int max3(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    // b. Is n a square number? (0, 1, 4, 9, 16, ...)
    public static boolean isSquare(int n) {
        if (n < 0) return false;
        int r = (int) Math.round(Math.sqrt(n));
        return r * r == n;
    }

    // c. Combination C(n, k) = n! / (k! (n - k)!)
    public static long factorial(int n) {
        long f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    public static long combination(int n, int k) {
        if (k < 0 || k > n) return 0;
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    // d. Is num a pentagonal number? Pn = n(3n - 1) / 2 for n = 1, 2, 3, ...
    public static boolean isPentagonal(int num) {
        for (int n = 1; ; n++) {
            int p = n * (3 * n - 1) / 2;
            if (p == num) return true;
            if (p > num) return false;
        }
    }

    // e. Display the number of letters and digits in a String
    public static void countLettersDigits(String s) {
        int letters = 0, digits = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) letters++;
            else if (Character.isDigit(ch)) digits++;
        }
        System.out.println("Letters: " + letters + ", Digits: " + digits);
    }

    // f. void method: fills the array parameter with 10 random numbers 0 - 100.
    //    Arrays are passed by reference, so main can read the numbers.
    public static void generateRandom(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) arr[i] = rand.nextInt(101);
    }

    // g. void method: "returns" area and circumference through an array parameter
    //    result[0] = area (pi r^2), result[1] = circumference (2 pi r)
    public static void circle(double radius, double[] result) {
        result[0] = Math.PI * radius * radius;
        result[1] = 2 * Math.PI * radius;
    }

    // h. Generate random numbers 0 - 10; return the first number generated twice
    public static int firstRepeated() {
        Random rand = new Random();
        boolean[] seen = new boolean[11];
        while (true) {
            int x = rand.nextInt(11);
            if (seen[x]) return x;
            seen[x] = true;
        }
    }

    public static void main(String[] args) {
        System.out.println("a. max3(4, 9, 2) = " + max3(4, 9, 2));
        System.out.println("b. isSquare(49) = " + isSquare(49) + ", isSquare(50) = " + isSquare(50));
        System.out.println("c. C(5, 2) = " + combination(5, 2) + ", C(10, 3) = " + combination(10, 3));
        System.out.println("d. isPentagonal(22) = " + isPentagonal(22) + ", isPentagonal(23) = " + isPentagonal(23));

        System.out.print("e. \"Hello World 2026\" -> ");
        countLettersDigits("Hello World 2026");

        int[] nums = new int[10];
        generateRandom(nums);
        System.out.print("f. 10 random numbers: ");
        for (int n : nums) System.out.print(n + " ");
        System.out.println();

        double[] res = new double[2];
        circle(3.0, res);
        System.out.printf("g. radius 3: area = %.2f, circumference = %.2f%n", res[0], res[1]);

        System.out.println("h. first number generated twice = " + firstRepeated());
    }
}
