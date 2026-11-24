/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_4;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author tasni
 */
public class Question_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<>();

        //System.out.println("Enter a scores (negative score to quit):");

        while (true) {
            System.out.print("Enter a scores (negative score to quit):");
            double score = input.nextDouble();

            if (score < 0) {
                break; // Exit loop on negative score
            }

            scores.add(score);
        }

        // Check if any valid scores were entered
        if (scores.isEmpty()) {
            System.out.println("No scores were entered.");
        } else {
            double min = scores.get(0);
            double max = scores.get(0);
            double sum = 0;

            for (double s : scores) {
                if (s < min) min = s;
                if (s > max) max = s;
                sum += s;
            }

            double average = sum / scores.size();

            // Calculate standard deviation
            double varianceSum = 0;
            for (double s : scores) {
                varianceSum += Math.pow(s - average, 2);
            }

            double standardDeviation = 0;
            if (scores.size() > 1) {
                // Using sample standard deviation formula (N - 1)
                standardDeviation = Math.sqrt(varianceSum / (scores.size() - 1));
            } else {
                // Standard deviation is 0 if there's only 1 score
                standardDeviation = 0; 
            }

            // Display Results
            System.out.println(scores.size());
            System.out.println("Minimum Score: " + min);
            System.out.println("Maximum Score: " + max);
            System.out.printf("Average Score: %.2f%n", average);
            System.out.printf("Standard Deviation : %.2f%n", standardDeviation);
        }

        input.close();
    }
}
    

