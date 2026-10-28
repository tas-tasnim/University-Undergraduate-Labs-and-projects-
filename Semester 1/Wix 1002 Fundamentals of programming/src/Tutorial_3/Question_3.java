/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_3;

/**
 *
 * @author tasni
 */
public class Question_3 {
    public static void main(String[] arg) {
        
        //Write the output for the following statements when x=9 and y=10 
        
        int x =9, y=10;
        
        // a.
        System.out.println("Answer of a. is : ");
        if (x < 10 && y > 10){
            System.out.println("*****");
        }else{
            System.out.println("#####"); 
            System.out.println("$$$$$");
        }
        
        //b.
        System.out.println("Answer of b. is : ");
        if (x < 10 && y > 10){
            System.out.println("*****");
        }else{
            System.out.println("#####"); 
            System.out.println("$$$$$");
        }
        
        //c.
        System.out.println("Answer of c. is : ");
        if(x < 10 && y < 10){
            System.out.println("*****"); 
            System.out.println("#####"); 
        }else{
            System.out.println("$$$$$");
        }
        
        //d.
        System.out.println("Answer of d. is : ");
        if (x > 10 && y > 10){
            System.out.println("*****"); 
            System.out.println("#####");
        }else{
            System.out.println("$$$$$");
        }
    }
}
