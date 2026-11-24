
import java.util.Scanner;



public class Q3{

    static void checkpostcode(String postcode){
        // PART 3: Normalize postcode

            postcode = postcode.replace(" ", "");
            postcode = postcode.replace("-", "");
            postcode = postcode.toUpperCase();

            if (postcode.startsWith("MY")) {
                postcode = postcode.substring(2);
            }
    }

    static double calculate(int grams, int length, int width, int height){

        double actualWeight = grams / 1000.0;

            double volumetricWeight =
                    (double) length * width * height / 5000.0;

            double chargeableWeight =
                    Math.ceil(Math.max(actualWeight, volumetricWeight));

            return chargeableWeight;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // PART 1: Declare variables

        int parcelsProcessed = 0;
        int heaviestWeight = 0;

        double totalFees = 0;

        // PART 2: Process parcels until EXIT

        while (true) {

            System.out.print("Enter destination postcode (or EXIT to stop): ");
            String postcode = input.nextLine();

            // Check EXIT
            if (postcode.trim().equalsIgnoreCase("EXIT")) {
                break;
            }

            // PART 3: Normalize postcode

            checkpostcode(postcode);

            // PART 4: Identify destination zone

            String zone = "";
            String countryCode = "";

            boolean international = false;
            boolean validPostcode = true;

            if (postcode.length() >= 2 &&
                Character.isLetter(postcode.charAt(0)) &&
                Character.isLetter(postcode.charAt(1))) {

                international = true;
                countryCode = postcode.substring(0, 2);
                zone = "International (" + countryCode + ")";

            } else {

                // Domestic postcode validation

                if (postcode.length() != 5) {
                    validPostcode = false;
                } else {

                    for (int i = 0; i < 5; i++) {
                        if (!Character.isDigit(postcode.charAt(i))) {
                            validPostcode = false;
                            break;
                        }
                    }
                }

                if (validPostcode) {

                    int area = Integer.parseInt(postcode.substring(0, 2));

                    if (area >= 50 && area <= 60) {
                        zone = "Klang Valley";
                    }
                    else if ((area >= 1 && area <= 49) ||
                             (area >= 61 && area <= 86)) {
                        zone = "Peninsular";
                    }
                    else if (area >= 87 && area <= 98) {
                        zone = "East Malaysia";
                    }
                    else {
                        validPostcode = false;
                    }
                }
            }

            // Invalid postcode: skip this parcel

            if (!validPostcode) {
                System.out.println("Error: Invalid postcode. Parcel skipped.");
                continue;
            }

            // PART 5: Get and validate weight

            int grams;

            while (true) {

                System.out.print("Enter parcel weight (g): ");

                if (!input.hasNextInt()) {

                    System.out.println("Error: Weight must be an integer.");

                    input.nextLine();

                } else {

                    grams = input.nextInt();
                    input.nextLine();

                    if (grams > 0) {
                        break;
                    }

                    System.out.println("Error: Weight must be greater than 0.");
                }
            }

            // PART 6: Get and validate dimensions

            int length = 0;
            int width = 0;
            int height = 0;

            boolean validDimensions = false;

            while (!validDimensions) {

                System.out.print("Enter dimensions LxWxH (cm): ");
                String dimensions = input.nextLine();

                String[] parts = dimensions.toLowerCase().split("x", -1);

                if (parts.length == 3) {

                    try {

                        length = Integer.parseInt(parts[0]);
                        width = Integer.parseInt(parts[1]);
                        height = Integer.parseInt(parts[2]);

                        if (length > 0 && width > 0 && height > 0) {
                            validDimensions = true;
                        } else {
                            System.out.println("Error: Use the format LxWxH with positive numbers, e.g. 30x20x10.");
                        }

                    } catch (NumberFormatException e) {

                        System.out.println("Error: Use the format LxWxH with positive numbers, e.g. 30x20x10.");
                    }

                } else {

                    System.out.println("Error: Use the format LxWxH with positive numbers, e.g. 30x20x10.");
                }
            }

            // PART 7: Calculate actual and volumetric weight

            double actualWeight = 0.0; 
            double volumetricWeight = 0.0;

            double chargeableWeight = calculate( grams, length, width, height);
            int chargeableKg = (int) chargeableWeight;

            // PART 8: Calculate normal shipping fee

            double fee;

            if (international) {

                fee = chargeableKg * 35.00;

            }
            else if (zone.equals("Klang Valley")) {

                fee = 6.00 + (chargeableKg - 1) * 1.50;

            }
            else if (zone.equals("Peninsular")) {

                fee = 8.00 + (chargeableKg - 1) * 2.00;

            }
            else {

                fee = 14.00 + (chargeableKg - 1) * 4.50;
            }

            // PART 9: Apply discount or surcharge

            String adjustment = "None";

            if (chargeableKg >= 5 && chargeableKg <= 10) {

                fee = fee * 0.95;

                adjustment = "5% bulk discount";

            }
            else if (chargeableKg > 10) {

                fee = fee * 1.15;

                adjustment = "15% heavy parcel surcharge";
            }

            // PART 10: Update statistics

            parcelsProcessed++;

            totalFees = totalFees + fee;

            if (chargeableKg > heaviestWeight) {
                heaviestWeight = chargeableKg;
            }

            // PART 11: Display parcel summary

            System.out.println("\nShipping Summary");

            System.out.println("Postcode: " + postcode);
            System.out.println("Zone: " + zone);

            System.out.printf(
                "Actual Weight: %.2f kg | Volumetric Weight: %.2f kg%n",
                actualWeight, volumetricWeight
            );

            System.out.println("Chargeable Weight: " + chargeableKg + " kg");

            System.out.println("Adjustment: " + adjustment);

            System.out.printf("Shipping Fee: RM %.2f%n", fee);

            System.out.println();
        }

        // PART 12: Final report

        System.out.println("\nParcels Processed: " + parcelsProcessed);

        System.out.printf("Total Shipping Fees: RM %.2f%n", totalFees);

        System.out.println("Heaviest Chargeable Weight: "
                + heaviestWeight + " kg");

        input.close();
    }
}

