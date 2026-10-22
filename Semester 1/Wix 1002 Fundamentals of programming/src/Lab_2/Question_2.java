/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;


public class Question_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the price of the car (P): ");
        double P = scanner.nextDouble();
        
        System.out.print("Enter the down payment- (D): ");
        double D = scanner.nextDouble();
        
        System.out.print("Enter the interest rate in % (R): ");
        double R = scanner.nextDouble();
        
        System.out.print("Enter the loan duration in years (Y): ");
        int Y = scanner.nextInt();
        
        double M = (P - D) * (1 + R * Y / 100.0) / (Y * 12);
        
        System.out.printf("Monthly Payment: %.2f\n", M);
        
        scanner.close();
    
}
}