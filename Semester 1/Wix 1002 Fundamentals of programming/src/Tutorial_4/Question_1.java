/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial_4;
import java.util.Scanner;
/**
 *
 * @author tasni
 */
public class Question_1 {
    public static void main(String[] arg){
        //Write statements for each of the following
        Scanner sc = new Scanner(System.in);
        //a. Find the largest integer n so that n3 is less than 2000.
        
        int n = 1;

        while (n * n * n < 2000) {
            n++;
        }        
        System.out.println("Largest n = " + (n - 1));

        //b. Display the square number of the first twelve integers starting from 1.
        
        for (int i = 1; i <= 12; i++) {
            System.out.println(i * i);
        }
        
        //c. Display a 4-by-5 matrix using random number within 0 to 100. 
        
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                int num = (int)(Math.random() * 101);
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
        
        //d. Compute the sum of numbers from 1 to a given number. 
        
        
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        
        System.out.println("Sum = " + sum);

        //e. Compute the sum of the series: 1/25+2/24+3/23 … + 25/1 in two decimal places.
        
        double sum2 = 0;
        
        for (int i = 1; i <= 25; i++) {
            sum2 += (double) i / (26 - i);
        }
        
        System.out.printf("Sum = %.2f\n", sum2);
        
        sc.close();
  
    }
    
}
