/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;

public class Question_3 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int num1 = random.nextInt(41) + 10;
        int num2 = random.nextInt(41) + 10;
        int num3 = random.nextInt(41) + 10;
        
        int sum = num1 + num2 + num3;
        double average = sum / 3.0;
        
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Number 3: " + num3);
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f\n", average);
    }
}
    
