
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // PART 1: Get command string

        System.out.print("Enter robot commands: ");
        String commands = input.nextLine();

        // PART 2: Validate command string

        boolean valid = true;

        for (int i = 0; i < commands.length(); i++) {

            char c = commands.charAt(i);

            if (c != 'F' && c != 'B' &&
                c != 'L' && c != 'R' &&
                c != 'f' && c != 'b' &&
                c != 'l' && c != 'r') {

                valid = false;
                break;
            }
        }

        if (!valid) {
            System.out.println("Invalid Command String");
            input.close();
            return;
        }

        // PART 3: Initialize robot positions and directions

        int xP = 0, yP = 0;
        int xQ = 0, yQ = 0;

        // 0 = North, 1 = East, 2 = South, 3 = West

        int directionP = 0;
        int directionQ = 0;

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        char[] headings = {'N', 'E', 'S', 'W'};

        // PART 4: Initialize statistics

        int meetings = 0;
        int originReturns = 0;
        int maxGap = 0;

        // PART 5: Process commands

        for (int i = 0; i < commands.length(); i++) {

            char c = commands.charAt(i);

            boolean moved = false;
            boolean robotP = false;

            // Robot P commands (uppercase)

            if (c == 'F' || c == 'B' ||
                c == 'L' || c == 'R') {

                robotP = true;

                if (c == 'F') {

                    xP = xP + dx[directionP];
                    yP = yP + dy[directionP];

                    moved = true;

                }
                else if (c == 'B') {

                    xP = xP - dx[directionP];
                    yP = yP - dy[directionP];

                    moved = true;

                }
                else if (c == 'R') {

                    directionP = (directionP + 1) % 4;

                }
                else if (c == 'L') {

                    directionP = (directionP + 3) % 4;

                }
            }

            // Robot Q commands (lowercase)

            else {

                if (c == 'f') {

                    xQ = xQ + dx[directionQ];
                    yQ = yQ + dy[directionQ];

                    moved = true;

                }
                else if (c == 'b') {

                    xQ = xQ - dx[directionQ];
                    yQ = yQ - dy[directionQ];

                    moved = true;

                }
                else if (c == 'r') {

                    directionQ = (directionQ + 1) % 4;

                }
                else if (c == 'l') {

                    directionQ = (directionQ + 3) % 4;

                }
            }

            // PART 6: Update statistics after every move

            if (moved) {

                // Check meetings

                if (xP == xQ && yP == yQ) {
                    meetings++;
                }

                // Check origin returns

                if (robotP) {

                    if (xP == 0 && yP == 0) {
                        originReturns++;
                    }

                } else {

                    if (xQ == 0 && yQ == 0) {
                        originReturns++;
                    }
                }

                // Calculate Manhattan distance

                int gap = Math.abs(xP - xQ)
                        + Math.abs(yP - yQ);

                if (gap > maxGap) {
                    maxGap = gap;
                }
            }
        }

        // PART 7: Simplify commands

        StringBuilder simplified = new StringBuilder();

        for (int i = 0; i < commands.length(); i++) {

            char c = commands.charAt(i);

            boolean cancel = false;

            if (simplified.length() > 0) {

                char last = simplified.charAt(
                    simplified.length() - 1
                );

                // Check opposite commands

                if ((c == 'F' && last == 'B') ||
                    (c == 'B' && last == 'F') ||
                    (c == 'L' && last == 'R') ||
                    (c == 'R' && last == 'L') ||
                    (c == 'f' && last == 'b') ||
                    (c == 'b' && last == 'f') ||
                    (c == 'l' && last == 'r') ||
                    (c == 'r' && last == 'l')) {

                    simplified.deleteCharAt(
                        simplified.length() - 1
                    );

                    cancel = true;
                }
            }

            // Keep command if it was not cancelled

            if (!cancel) {

                simplified.append(c);

                // Check four identical turns

                int n = simplified.length();

                if ((c == 'R' || c == 'L' ||
                     c == 'r' || c == 'l') && n >= 4) {

                    if (simplified.charAt(n - 1) == c &&
                        simplified.charAt(n - 2) == c &&
                        simplified.charAt(n - 3) == c &&
                        simplified.charAt(n - 4) == c) {

                        simplified.delete(n - 4, n);
                    }
                }
            }
        }

        // PART 8: Display final results

        System.out.println("Meetings: " + meetings);

        System.out.println("Origin Returns: " + originReturns);

        System.out.println("Maximum Gap: " + maxGap);

        System.out.printf(
            "Robot P Final: (%d,%d) facing %c%n",
            xP, yP, headings[directionP]
        );

        System.out.printf(
            "Robot Q Final: (%d,%d) facing %c%n",
            xQ, yQ, headings[directionQ]
        );

        if (simplified.length() == 0) {

            System.out.println("Simplified Commands: EMPTY");

        } else {

            System.out.println(
                "Simplified Commands: " + simplified
            );
        }

        input.close();
    }
}
