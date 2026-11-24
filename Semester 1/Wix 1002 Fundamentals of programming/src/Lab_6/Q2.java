package Lab_6;

/*
 * WIX1002 Fundamentals of Programming - Lab 6 (Java Methods), Question 2
 * multiPrint(int n, char c) prints n copies of character c.
 * It is used to display a triangle and a diamond.
 */
public class Q2 {

    // Prints n copies of c on the same line
    public static void multiPrint(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }

    // Centred triangle of '*' with the given number of rows
    public static void triangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            multiPrint(rows - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }
    }

    // Diamond = triangle (top half) + upside-down triangle (bottom half)
    public static void diamond(int rows) {
        triangle(rows);
        for (int i = rows - 1; i >= 1; i--) {
            multiPrint(rows - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Triangle:");
        triangle(5);
        System.out.println();
        System.out.println("Diamond:");
        diamond(5);
    }
}
