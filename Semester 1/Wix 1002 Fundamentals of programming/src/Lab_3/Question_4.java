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
public class Question_4 {
    public static void main(String[] arg){
        
        Random rand = new Random();
        
        int player_1_roll_1 = rand.nextInt(1,7);
        int player_1_roll_2 = rand.nextInt(1,7);
        
        int player_2_roll_1 = rand.nextInt(1,7);
        int player_2_roll_2 = rand.nextInt(1,7);
        
        int player1_score = player_1_roll_1 + player_1_roll_2;
        int player2_score = player_2_roll_1 + player_2_roll_2;
        
        
        if (player1_score > player2_score){
            System.out.println("Player 1 wins");
        }else{
            System.out.println("Player 2 wins");
            
        }
    
    }
    
}
