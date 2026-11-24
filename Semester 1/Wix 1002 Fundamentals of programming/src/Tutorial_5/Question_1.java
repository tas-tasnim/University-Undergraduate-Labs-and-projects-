/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_5;

/**
 *
 * @author tasni
 */
public class Question_1 {
    public  static void main(String[] arg){
        
        //a. Declare an array that used to store 12 floating point numbers. 
        
        float[] arr = new float[12];
        
        //b. Initialize an array that used to store the value of A to E.
        
        char[] arr_1 = {'A', 'B', 'C', 'D', 'E'};
        
        //c. Declare an array that used to store 100 students name. 
        
        String[] Students = new String[100];
        
        //d. Declare an array for a table with 6 rows 2 columns that used to store integer value.
        
        int[][] arr_2 = new int[6][2];
        
        /* e. Initialize an array with the following value:
                       [[6  9]
                        [2  5]
                        [4  6]] */
        
        int[][] arr_3 = {{6,9},{2,5},{4,6}};
        
        /*f. After initialize the array, modify the value of the above array to 
                       [[6  9]
                        [2  4]
                        [3  7]] */
        
        arr_3[1][1] = 4;
        arr_3[2][0] = 3;
        arr_3[2][1] = 7;
        
        //g. Display all the values of an array name contact in separate lines. 
        
        String[] Contact = {"Omor","Mahdi","Isa","Sarah"};
        
        for(String c : Contact){
            System.out.println(c);
        }
    } 
}
