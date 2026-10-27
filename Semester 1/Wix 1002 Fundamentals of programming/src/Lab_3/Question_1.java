/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Lab_3;

import java.util.Scanner;
/**
 *
 * @author tasni
 */
public class Question_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.printf("%d + %d = %d%n", num1, num2, (num1 + num2));
                break;
            case '-':
                System.out.printf("%d - %d = %d%n", num1, num2, (num1 - num2));
                break;
            case '*':
                System.out.printf("%d * %d = %d%n", num1, num2, (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.printf("%d / %d = %.2f%n", num1, num2, ((double) num1 / num2));
                }
                break;
            case '%':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.printf("%d %% %d = %d%n", num1, num2, (num1 % num2));
                }
                break;
            default:
                System.out.println("Error: Invalid operator entered.");
                break;
        }

        input.close();
    }
    
}
