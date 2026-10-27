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
public class Question_5 {
    public static void main(String[] arg){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a : ");
        double a = input.nextDouble();
        System.out.print("Enter b : ");
        double b = input.nextDouble();
        System.out.print("Enter c : ");
        double c = input.nextDouble();
        System.out.print("Enter d : ");
        double d = input.nextDouble();
        System.out.print("Enter e : ");
        double e = input.nextDouble();
        System.out.print("Enter f : ");
        double f = input.nextDouble();
        
        double x = (e*d-b*f)/(a*d-b*c);
        double y = (a*f-e*c)/(a*d-b*c);
        
        double Solution = a*d - b*c ;
        
        System.out.printf("The result of x is %.2f%n", x);
        System.out.printf("The result of y is %.2f%n", y);
        if (Solution == 0){
            System.out.print("The equation has no solution");
        } 
        input.close();
    }  
}
