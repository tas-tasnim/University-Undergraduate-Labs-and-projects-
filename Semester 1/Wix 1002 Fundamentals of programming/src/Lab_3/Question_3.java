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
public class Question_3 {
    public static void main(String[] arg){
        System.out.println("Enter your sales value:");
        
        Scanner sc = new Scanner(System.in);
        
        double sales = sc.nextDouble();
        
        double rate = 0.0;
        
        if (sales < 0){
            System.out.println("sales value cannot be negative!");
        }else if(sales <= 100){
            rate = 0.05;
        }else if (sales <= 500){
            rate = 0.075;
        }else if (sales <= 1000){
            rate = 0.1;
        }else if (sales > 1000){
            rate = 0.12;
        }
        
        System.out.printf("Comission rate is = %.2f%n", rate);
    
    }
    
}
