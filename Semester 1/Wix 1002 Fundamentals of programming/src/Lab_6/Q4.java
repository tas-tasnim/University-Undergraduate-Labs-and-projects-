package Lab_6;

/*
 * WIX1002 Fundamentals of Programming - Lab 6 (Java Methods), Question 4
 * Euclidean algorithm: returns the greatest common divisor of two
 * positive integers. Prints GCD(24, 8) and GCD(200, 625).
 */
public class Q4 {

    // gcd(a, b) = gcd(b, a % b) until b becomes 0; then the answer is a
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("GCD(24, 8) = " + gcd(24, 8));
        System.out.println("GCD(200, 625) = " + gcd(200, 625));
    }
}
