/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_3;

/**
 *
 * @author tasni
 */
public class Question_2 {
    public static void main(String[] arg) {
        
        int num1=0,num2=0,x=0,y=0,z=0;
        
        //Correct the error for the following statements. 

        /**a.  
        if (num1 = num2) 
            System.out.println("Number 1 is equal to number 2."); */
        
        if (num1 == num2) {
            System.out.println("Number 1 is equal to number 2.");
        }
        
        /*b.
        if (x > y > z)      
            System.out.println("x is the largest number"); */
        
        if (x > y && y > z){
            System.out.println("x is the largest number");
        }
        
        /*c.
        String s1, s2; 
        if (s1==s2) 
            System.out.println("They are equal strings."); 
            else (s1!=s2) 
            System.out.println("They are not equal strings.");*/
        
        String s1 = "s1",s2="s2"; // Something have to be inserted
        if (s1.equals(s2)){
            System.out.println("They are equal strings.");
        }else{
            System.out.println("They are not equal strings.");
        }
 
        /*d.
        if x>0 or y>0; 
            System.out.println("Either x or y is positive"); 
        */
        
        if (x > 0 || y > 0){
            System.out.println("Either x or y is positive");
        }
    }
    
}
