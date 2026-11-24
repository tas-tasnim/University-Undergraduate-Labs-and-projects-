/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_5;
import java.util.Random;
/**
 *
 * @author tasni
 */
public class Question_6 {
    public static void main(String[] arg){
        
        /*Write the statements that generate 1 random integer within 0 – 255. Convert the 
          number to binary and store the bit into an 8 bit array. Then, display the binary number.*/
        
        Random random = new Random();
        int num = random.nextInt(256);
        
        System.out.println("Generated number : "+num);
        
        int[] binary_arr = new int[8];
        int temp = num;
        
        for (int i = 7; i >= 0; i--) {
            binary_arr[i] = temp & 1;
            temp >>= 1;
        } 
        
        System.out.print("Binary (8-bit): ");
        for (int bit : binary_arr) {
            System.out.print(bit);
        }      System.out.println();
    }
    
}
