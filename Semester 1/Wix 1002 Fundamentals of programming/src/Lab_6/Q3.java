package Lab_6;

/*
 * WIX1002 Fundamentals of Programming - Lab 6 (Java Methods), Question 3
 * Method that accepts an array of 10 integers and reverses every integer
 * in the array (e.g. 1234 becomes 4321).
 */
public class Q3 {

    // Reverses the digits of one number: 1234 -> 4321
    public static int reverseNumber(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }

    // Reverses every integer in the array (the array is changed in place)
    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverseNumber(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1234, 567, 89, 1000, 4321, 12, 908, 55, 7, 2026};

        System.out.print("Before: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();

        reverseArray(arr);

        System.out.print("After:  ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}
