/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_5;

/**
 *
 * @author tasni
 */
public class Question_2 {
    public static void main(String[] arg){
        
        //Correct the error for the following statements.
        
        /* a.  
            String[] code = {'AAA', 'AAB', 'AAC', 'AAD'};
        */
        String[] code = {"AAA", "AAB", "AAC", "AAD"};
        
        /*b.  
            int[] num = new num[10]; 
            for(int k=0; k<=num.length(); k++) 
            sum+=num;*/
        
        int[] num = new int[10];
        int sum = 0;
        for(int k=0; k<num.length; k++){
            sum+=num[k];
        }
        
        /*c.
        int [][]t = new int[3][]; 
        t[1][2] = 5;*/ 
        
        int [][]t = new int[3][3]; 
        t[1][2] = 5;
        
        /*d.
        int i=4; 
        int []score = new int[5]; 
        score [1] = 78; 
        score[++i] = 100; 
        */
        
        int i=4; 
        int [] score = new int[5]; 
        score[1] = 78; 
        score[--i] = 100;  
        
    }
    
}
