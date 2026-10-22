/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;

public class Question_5 {
 
    public static void main(String[] args) {
        Random randomGen = new Random();
        int rand = randomGen.nextInt(0, 10000); //inclusive for the lower bound //exclusive for the upper bound
        System.out.println("The random number generated is " + rand);
        System.out.println("The sum of digits using For loop is   : " + sumDigitsUsingFor(rand));
        System.out.println("The sum of  digits using While loop is : " + sumDigitsUsingWhile(rand));
    }
    public static Integer sumDigitsUsingFor(Integer number) {
       int sum = 0;
       for(; number > 0; number /= 10) {
           sum += number % 10;
       }
//       for(int i = 0; i<10; ++i) { //post-increment: use the value first then increase //pre-increment: increase the value first and then use it. i=5
//           // i++
//       }
       return sum;
    }
    public static Integer sumDigitsUsingWhile(Integer number) {
        int sum = 0;
        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
 
// Random Options:
// java.util.Random
// Math.random()
 
// ThreadLocalRandom
// SecureRando
