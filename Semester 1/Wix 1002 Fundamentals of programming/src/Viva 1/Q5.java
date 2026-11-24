
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X, Y, B;
        boolean valid;

        // STEP 1: Input validation
        do {
            System.out.print("Enter width X: ");
            X = input.nextInt();

            System.out.print("Enter height Y: ");
            Y = input.nextInt();

            System.out.print("Enter block size B: ");
            B = input.nextInt();

            valid = (X >= 7 && X <= 29 && X % 2 != 0)
                    && (Y >= 7 && Y <= 29 && Y % 2 != 0)
                    && (B >= 1 && B <= 3);

            if (!valid) {
                System.out.println(
                    "Error: X and Y must be odd numbers between 7 and 29, "
                    + "and B must be between 1 and 3."
                );
            }

        } while (!valid);


        // STEP 2: Find the centre
        int centreRow = Y / 2;
        int centreCol = X / 2;


        // STEP 3: Print the complete design
        for (int r = 0; r < Y; r++) {

            // Calculate the two diagonal columns
            int diag1 = (int) Math.round(
                (double) r * (X - 1) / (Y - 1)
            );

            int diag2 = (X - 1) - diag1;


            for (int c = 0; c < X; c++) {

                // STEP 4: Apply priority rules

                // Priority 1: Frame corners
                if ((r == 0 || r == Y - 1)
                        && (c == 0 || c == X - 1)) {

                    System.out.print("+");

                }

                // Priority 2: First or last row
                else if (r == 0 || r == Y - 1) {

                    System.out.print("=");

                }

                // Priority 3: First or last column
                else if (c == 0 || c == X - 1) {

                    System.out.print("I");

                }

                // Priority 4: Centre cell
                else if (r == centreRow && c == centreCol) {

                    System.out.print("@");

                }

                // Priority 5: Diagonals
                else if (c == diag1 || c == diag2) {

                    System.out.print("X");

                }

                // Priority 6: Centre row
                else if (r == centreRow) {

                    System.out.print("-");

                }

                // Priority 7: Centre column
                else if (c == centreCol) {

                    System.out.print("|");

                }

                // Priority 8: Checkerboard
                else if ((r / B + c / B) % 2 == 0) {

                    System.out.print(".");

                }

                // Priority 9: Everything else
                else {

                    System.out.print("o");

                }
            }

            // Move to the next row
            System.out.println();
        }

        input.close();
    }
}
