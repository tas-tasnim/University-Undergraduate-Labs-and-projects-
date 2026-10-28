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
public class Question_5 {
    public static void main(String[] arg) {
        
        /*Write the java statements that determine whether the Leap year. A Leap year is 
        divisible by 4 but not by 100. However, a Leap year is also divisible by 400.*/
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the year : ");
        int Year = input.nextInt();
        
        if (Year % 4 == 0 && Year % 100 != 0 && Year % 400 == 0) {
            System.out.print("It is a leap year");
        }else{
            System.out.print("It is not a leap year");
        }
        
        input.close();
    }
    
}
