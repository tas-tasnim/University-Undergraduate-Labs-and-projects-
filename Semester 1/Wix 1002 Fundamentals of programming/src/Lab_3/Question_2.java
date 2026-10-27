/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_3;

import java.util.Random;

/**
 *
 * @author tasni
 */
public class Question_2 {
    public static void main(String[] arg){
        Random random = new Random();
    
    int number = random.nextInt(6)+1;
     
    String word = "";
    
    switch (number){
        case 0:
            word = "Zero";
            break;
        case 1:
            word = "One";
            break;
        case 2:
            word = "Two";
            break;
        case 3:
            word = "Three";
            break;
        case 4:
            word = "Four";
            break;
        case 5:
            word = "Five";
            break;       
    }
    
    System.out.printf("%d is %s%n",number,word);
    }
    
}
