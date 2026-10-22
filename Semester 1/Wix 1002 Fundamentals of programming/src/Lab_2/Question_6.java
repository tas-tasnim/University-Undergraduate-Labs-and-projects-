/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class Question_6 {
    public static void main(String[] args){

        try(Scanner scanner = new Scanner(System.in)) {
            NumberFormat numFormat = new DecimalFormat("0.######E0");
 
            System.out.print("Enter the amount of water in gram: ");
            var waterWeight = scanner.nextDouble() / 1000;
 
            System.out.print("Enter the initial temperature in Fahrenheit: ");
            double tempIni = convertFahrenheitToCelsius(scanner.nextDouble());
 
            System.out.print("Enter the final temperature in Fahrenheit: ");
            double tempFinal = convertFahrenheitToCelsius(scanner.nextDouble());
 
            double energy = waterWeight * (tempFinal - tempIni) * 4184;
 
            // Display 1
            System.out.printf("The energy needed is %.6e%n", energy); // %n is new line //%.6e is scientific notation %.6 is number of decimal places
 
            // Display 2
            System.out.println("The energy needed is " + numFormat.format(energy));
        }
    }
    public static Double convertFahrenheitToCelsius(double temp) {
        return (temp - 32) * 5 / 9;
    }
}
 
 
// qs
 
// q1 - scientific with 5 dp - find format part ex: %.6e => %.5e
// q2 - +1.234567e+04 => %+.6e // %- left align is not the same as %+ ass positive sign
// q3 - input: 12345.67, output: takes exactly 15 spaces => %15.6e //by default right align
// q4 - input: 12345.67, output: takes exactly 15 spaces and left align => %-15.6e
 
 
//  333 + 8 = 341
// 3353 + 8 = 341
//  333 + 8 = 341
//   33 + 8 = 341

