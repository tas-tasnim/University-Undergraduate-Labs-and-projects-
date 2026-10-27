/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_3;
import java.util.Scanner;
/**
 *
 * @author tasni
 */
public class Valid_Boomreng_Lab_3_task_ {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        int[][] points = new int[3][2];

        // Take input for three points
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter x and y for point " + (i + 1) + ": ");
            points[i][0] = input.nextInt();
            points[i][1] = input.nextInt();
        }

        // Check whether the points form a boomerang
        int x1 = points[0][0], y1 = points[0][1];
        int x2 = points[1][0], y2 = points[1][1];
        int x3 = points[2][0], y3 = points[2][1];

        if ((x2 - x1) * (y3 - y1) != (y2 - y1) * (x3 - x1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        input.close();
    }
    
}
