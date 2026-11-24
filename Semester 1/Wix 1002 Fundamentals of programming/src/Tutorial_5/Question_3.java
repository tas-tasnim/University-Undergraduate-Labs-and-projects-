/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_5;

/**
 *
 * @author tasni
 */
public class Question_3 {
    public static void main(String[] arg){
        
        int[] marks = new int[5]; 
        int i = 0, j = 1; 
        marks[i] = 12; 
        marks[j] = marks[i] + 19; 
        marks[j-1] = marks[j] * marks [j]; 
        marks[j*3] = marks[i+1]; 
        marks[++j] = marks[i]%5; 
        marks[2*j] = marks[j-1]; 
        
        for(int x : marks){
            System.out.println(x);
        }
        
    }
    
}
