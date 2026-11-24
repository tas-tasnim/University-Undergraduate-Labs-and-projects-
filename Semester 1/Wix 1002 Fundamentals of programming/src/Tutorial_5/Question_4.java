/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_5;

/**
 *
 * @author tasni
 */
public class Question_4 {
    public static void main(String[] arg){
        
        /* Write the statements that display the number of occurrence of the word "the" (case 
           sensitive) in a string array name sentence.*/
        
        String[] sentence = {"the", "cat", "and", "The", "dog", "ran", "the"};
        int count = 0;


        for (int i = 0; i < sentence.length; i++) {
   
        if (sentence[i].equals("the")) {
            count++;
        }
        }   

        System.out.println("Number of occurrences of \"the\": " + count);
 
        
    }   
}
