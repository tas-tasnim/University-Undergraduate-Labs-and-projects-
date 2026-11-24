/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_4;
import java.util.Scanner;
/**
 *
 * @author tasni
 */
public class Question_5 {
    public static void main(String[] arg){
        
        /*Write the statements that display the string in reverse order. (use String.length() to get 
          the length of the string)*/
        
        Scanner input = new Scanner(System.in);
        
        String str = input.nextLine();
        
        for (int i = str.length() - 1 ; i >= 0 ; i--){
            System.out.print(str.charAt(i));
        }
        
        input.close();
    }
    
}
