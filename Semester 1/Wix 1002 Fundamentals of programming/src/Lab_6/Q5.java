package Lab_6;

import java.util.Random;
import java.util.Scanner;

/*
 * WIX1002 Fundamentals of Programming - Lab 6 (Java Methods), Question 5
 * checkProduct(a, b, c) returns true if c == a * b.
 * Multiplication game with random numbers from 0 to 12.
 */
public class Q5 {

    // Is the third parameter equal to the first times the second?
    public static boolean checkProduct(int a, int b, int c) {
        return a * b == c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int rounds = 5;
        int score = 0;

        for (int i = 1; i <= rounds; i++) {
            int a = rand.nextInt(13);   // 0 - 12
            int b = rand.nextInt(13);   // 0 - 12
            System.out.print("Question " + i + ": " + a + " x " + b + " = ");
            int answer = input.nextInt();

            if (checkProduct(a, b, answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong. The answer is " + (a * b));
            }
        }
        System.out.println("Your score: " + score + "/" + rounds);
    }
}
