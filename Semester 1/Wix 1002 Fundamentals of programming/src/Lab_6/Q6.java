package Lab_6;

/*
 * WIX1002 Fundamentals of Programming - Lab 6 (Java Methods), Question 6
 * Palindromic prime: a prime that reads the same backwards (e.g. 131).
 * Emirp: a prime whose reverse is also prime, and which is not a
 * palindromic prime (e.g. 13 -> 31).
 * Displays the first 20 palindromic primes and the first 20 emirps.
 */
public class Q6 {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int reverseNumber(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }

    public static boolean isPalindromicPrime(int n) {
        return isPrime(n) && isPalindrome(n);
    }

    public static boolean isEmirp(int n) {
        return isPrime(n) && !isPalindrome(n) && isPrime(reverseNumber(n));
    }

    public static void main(String[] args) {
        System.out.println("First 20 palindromic primes:");
        int count = 0;
        for (int n = 2; count < 20; n++) {
            if (isPalindromicPrime(n)) {
                System.out.print(n + " ");
                count++;
            }
        }
        System.out.println();

        System.out.println("First 20 emirps:");
        count = 0;
        for (int n = 2; count < 20; n++) {
            if (isEmirp(n)) {
                System.out.print(n + " ");
                count++;
            }
        }
        System.out.println();
    }
}
