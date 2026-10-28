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
public class Question_1 {
    public static void main(String[] arg){
        
        Scanner input = new Scanner(System.in);
        
        // Write statements for each of the following
        
        // a. Determine whether 3x8=27.

        if (3 * 8 == 27){
            System.out.println(" 3 * 8 is equal to 27 ");
        }else{
            System.out.println(" 3 * 8 is not equal to 27 ");
        }
        
        // b. Determine whether an input integer is an odd number or even number. 
        
        int num = input.nextInt();

         if (num % 2 == 0){
             System.out.println("Even number");
         }else{
             System.out.println("Odd number");
         }

        // c. Determine whether a character is a capital letter.  
        
        char ch = input.next().charAt(0);
        
        if (ch >= 'A' && ch <= 'Z'){
            System.out.println("Capital letter");
        }else{
            System.out.println("Not a capital letter");
        }
    
        // d. Display two strings in alphabetical order ignoring their case. 
        
        String s1 = input.next();
        String s2 = input.next();
        
        if (s1.compareToIgnoreCase(s2) <= 0) {
            System.out.println(s1 + " " + s2);
        }else{
            System.out.println(s2 + " " + s1);
        }
        
        // e. A switch statement that display Sunday, Monday, .., Satudary if the input is 0, 1, …, 6. 
        
        int day = input.nextInt();
        
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }      
    }
}
