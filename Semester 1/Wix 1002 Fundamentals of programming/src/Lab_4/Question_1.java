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
public class Question_1 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer : ");
        
        int num = input.nextInt();
        
        // Handle zero edge case
        if (num == 0) {
            System.out.println("0 is divisible by all non-zero numbers (infinitely many factors).");
        } else {
            // Use absolute value so negative numbers are handled correctly
            int limit = Math.abs(num);
            
            System.out.print("The factors are: ");
            for (int i = 1; i <= limit; i++) {
                if (limit % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        
        input.close();
    }
}
        
