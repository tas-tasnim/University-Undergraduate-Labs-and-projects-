
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // STEP 1: Store vehicle information
        String[] names = {
            "Compact Hatch",
            "Family SUV",
            "Delivery Van",
            "E-Scooter"
        };

        int[] capacity = {40, 75, 90, 4};

        int[] maxPower = {50, 120, 80, 3};

        boolean[] charged = {false, false, false, false};


        // STEP 2: Initialize hub and report variables
        double hubEnergy = 150.0;

        int vehiclesCharged = 0;

        double totalDelivered = 0.0;

        double totalRevenue = 0.0;

        boolean operatorClosed = false;


        // STEP 3: Main loop
        while (hubEnergy > 0 && !operatorClosed) {

            // Display menu
            System.out.println("\n===== Solar EV Charging Hub =====");

            System.out.printf("Hub Battery: %.2f kWh%n", hubEnergy);

            for (int i = 0; i < 4; i++) {

                System.out.printf(
                    "%d. %s (%d kWh, max %d kW)",
                    i + 1,
                    names[i],
                    capacity[i],
                    maxPower[i]
                );

                if (charged[i]) {
                    System.out.print(" [DONE]");
                }

                System.out.println();
            }

            System.out.println("0. Close hub");


            // STEP 4: Read vehicle selection
            System.out.print("Select a vehicle (0-4): ");

            if (!input.hasNextInt()) {

                System.out.println(
                    "Error: Please enter an integer from 0 to 4."
                );

                input.next();
                continue;
            }

            int choice = input.nextInt();


            // STEP 5: Validate selection

            if (choice == 0) {

                System.out.println("Hub closed by operator.");

                operatorClosed = true;
                break;
            }

            if (choice < 0 || choice > 4) {

                System.out.println(
                    "Error: Invalid vehicle selection."
                );

                continue;
            }

            // Convert menu choice to array index
            int index = choice - 1;


            // Check whether already charged
            if (charged[index]) {

                System.out.println(
                    "Error: This vehicle has already been charged."
                );

                continue;
            }


            // STEP 6: Get current battery level
            int current;

            do {

                System.out.print(
                    "Enter current battery level (0-99): "
                );

                current = input.nextInt();

                if (current < 0 || current > 99) {

                    System.out.println(
                        "Error: Current level must be between 0 and 99."
                    );
                }

            } while (current < 0 || current > 99);


            // STEP 7: Get target battery level
            int target;

            do {

                System.out.printf(
                    "Enter target battery level (%d-100): ",
                    current + 1
                );

                target = input.nextInt();

                if (target <= current || target > 100) {

                    System.out.println(
                        "Error: Target must be higher than the current "
                        + "level and at most 100."
                    );
                }

            } while (target <= current || target > 100);


            // STEP 8: Calculate required energy
            double delivered =
                capacity[index] * (target - current) / 100.0;

            double drawn = delivered / 0.90;


            // STEP 9: Calculate charging power
            int chargingPower = Math.min(maxPower[index], 60);


            // STEP 10: Check for partial charging
            boolean depleted = false;

            double reached = target;

            if (drawn > hubEnergy) {

                depleted = true;

                drawn = hubEnergy;

                delivered = drawn * 0.90;

                reached = current
                    + (delivered / capacity[index]) * 100.0;
            }


            // STEP 11: Calculate charging time
            double chargingTime =
                (delivered / chargingPower) * 60;


            // STEP 12: Calculate cost
            double cost = delivered * 1.20;

            if (delivered > 30) {

                cost = cost * 0.95;
            }


            // STEP 13: Update hub energy
            hubEnergy = hubEnergy - drawn;

            if (depleted) {
                hubEnergy = 0;
            }


            // STEP 14: Update final report totals
            charged[index] = true;

            vehiclesCharged++;

            totalDelivered += delivered;

            totalRevenue += cost;


            // STEP 15: Display charging summary
            System.out.println("\n--- Charging Summary ---");

            System.out.println("Vehicle: " + names[index]);

            System.out.printf(
                "Battery: %d%% -> %d%%%n",
                current,
                target
            );

            System.out.printf(
                "Charging Power: %d kW%n",
                chargingPower
            );

            System.out.printf(
                "Energy Delivered: %.2f kWh (drawn from hub: %.2f kWh)%n",
                delivered,
                drawn
            );

            System.out.printf(
                "Charging Time: %.2f minutes%n",
                chargingTime
            );

            System.out.printf(
                "Cost: RM %.2f%n",
                cost
            );

            System.out.printf(
                "Remaining Hub Battery: %.2f kWh%n",
                hubEnergy
            );


            // STEP 16: Stop if hub battery is depleted
            if (depleted) {

                System.out.printf(
                    "Hub Battery Depleted! Vehicle only reached %.2f%%.%n",
                    reached
                );

                break;
            }

            System.out.println("-----------------------");
        }


        // STEP 17: Final report
        System.out.println("\n===== Hub Report =====");

        System.out.println(
            "Vehicles Charged: " + vehiclesCharged
        );

        System.out.printf(
            "Total Energy Delivered: %.2f kWh%n",
            totalDelivered
        );

        System.out.printf(
            "Total Revenue: RM %.2f%n",
            totalRevenue
        );

        System.out.printf(
            "Hub Battery Left: %.2f kWh%n",
            hubEnergy
        );

        input.close();
    }
}
