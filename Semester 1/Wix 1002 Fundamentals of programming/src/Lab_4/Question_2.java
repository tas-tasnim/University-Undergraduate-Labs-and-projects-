/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_4;
import java.util.Scanner;

/**
 *
 * @author tasni
 */
public class Question_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer n: ");
        int n = input.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            int totalSum = 0;
            int currentSum = 0;
            
            // Loop from 1 to n to generate each term of the series
            for (int i = 1; i <= n; i++) {
                currentSum += i;         // Calculates the sum for the current group (e.g., 1, 1+2, 1+2+3...)
                totalSum += currentSum;  // Adds that group sum to the overall total
            }
            
            System.out.println("The sum of the series up to n = " + n + " is: " + totalSum);
        }
        
        input.close();
    }
}
    

