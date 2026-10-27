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
public class Question_6 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        
        System.out.print(" Enter the radius : ");
        double radius = input.nextDouble();
        System.out.print("Enter the x coordinate: ");
        double x = input.nextDouble();
        System.out.print("Enter the x coordinate: ");
        double y = input.nextDouble();
        
        double distance = Math.sqrt(x*x + y*y);
        
        if (radius < distance){
            System.out.println("The coordinate is outside the Circle");
        
        }else if (radius > distance){
            System.out.println("The coordinate is inside the Circle");
        }else{
            System.out.println("The circle is not valid");
        }
        
        input.close();
         
    }   
}
