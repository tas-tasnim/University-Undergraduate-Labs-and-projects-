/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_3;
import java.util.Scanner;

/**
 *
 * @author tasni
 */
public class Question_4 {
    public static void main(String[] arg){
        
        /*Write the java statements that used the if statement to find the biggest number among 
        three given integers.*/
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the 1st num : ");
        int num1 = input.nextInt();
        System.out.print("Enter the 2nd num : ");
        int num2 = input.nextInt();
        System.out.print("Enter the 3rd num : ");
        int num3 = input.nextInt();
        
        if (num1 > num2 && num1 > num3){
            System.out.printf("The biggest number is %d%n", num1);  
        }else if (num2 > num3 && num2 > num1){
            System.out.printf("The biggest number is %d%n", num2);
        }else{
            System.out.printf("The biggest number is %d%n", num3);
        }
    input.close();
}
}
