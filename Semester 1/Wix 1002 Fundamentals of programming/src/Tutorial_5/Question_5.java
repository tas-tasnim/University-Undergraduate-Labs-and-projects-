/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_5;

/**
 *
 * @author tasni
 */
public class Question_5 {
    public static void main(String[] arg){
        /*Write the statements that display the string array name sentence in reverse order. 
          Each string element must be displayed in reverse order as well. */
        
        String[] sentence = {"Welcome", "to","Malaysia!"};
        String[] reverse_word = new String[3];
        for(int i = sentence.length -1 ; i >= 0 ; i--){
            String word = sentence[i];
            String str = " ";
            
            for(int j = word.length() - 1 ; j>=0 ; j--){
                str += word.charAt(j);    
            }
            
            System.out.print(str);
    } 
    
    }
}
