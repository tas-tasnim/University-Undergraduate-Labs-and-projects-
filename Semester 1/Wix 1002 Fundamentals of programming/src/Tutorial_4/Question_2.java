/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_4;

/**
 *
 * @author tasni
 */
public class Question_2 {
    public static void main(String[] arg){
        //Correct the error for the following statements.
        int sum = 0, y = 0;
        
        /*a.for (x = 10; x > 0; x++) 
                sum += x; 
            }*/
        
        for (int x = 10; x > 0; x--){
            sum += x;
        }
        
        /*b. 
          do 
          x += 2; 
          y += x; 
            System.out.println(x + " and " + y); 
            while (x < 100)*/
        int x = 0;
        
        do{
            x += 2;
            y += x;
            System.out.println(x + " and " + y); 
        }while (x < 100);
        
        /*c.
        for ( x==1, y==20; x < y, x++, y-=2); 
            System.out.println(x & " " & y);*/ 
                
        for (x = 1, y = 20; x < y; x++, y -= 2){   // reuses x and y declared above (re-declaring them did not compile)
            System.out.println(x + " " + y);
        }
        
        /*d.
        i =1; 
        while(i<10) { 
            if (i==10) 
            System.out.println("Program End"); 
        }*/
        
        int i = 1;
        while(i<10) {
            if (i == 10){
                System.out.println("Program End");
            }
        }
 
        
    }         
}
