package Lab_6;

/*
 * WIX1002 Fundamentals of Programming - Lab 6 (Java Methods), Question 1
 * Method that returns a triangular number (1 + 2 + ... + n),
 * used to display the first 20 triangular numbers.
 */
public class Q1 {

    // Returns the n-th triangular number: 1 + 2 + 3 + ... + n
    public static int triangular(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The first 20 triangular numbers:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(triangular(i) + " ");
        }
        System.out.println();
    }
}
