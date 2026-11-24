import java.util.Scanner;
 

public class Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Original Phrase: ");
        String phrase = input.nextLine();

        // ---------- PASS 1: build the shift key ----------
        int sum = 0;
        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            if (c >= '0' && c <= '9') {
                sum += c - '0';
            }
        }
        int key = sum % 26;
        if (key == 0) {
            key = 13;
        }

        // ---------- PASS 2: encode each character ----------
        String symbols = "!@#$%";
        StringBuilder encoded = new StringBuilder();

        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);

            if (c >= 'a' && c <= 'z') {
                // lowercase: circular shift forward by key
                encoded.append((char) ('a' + (c - 'a' + key) % 26));

            } else if (c >= 'A' && c <= 'Z') {
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    // uppercase vowel: * + lowercase vowel
                    encoded.append('*').append(Character.toLowerCase(c));
                } else {
                    // uppercase consonant: next letter in lowercase (circular)
                    encoded.append((char) ('a' + (c - 'A' + 1) % 26));
                }

            } else if (c >= '0' && c <= '9') {
                // digit: (d * d) % 10
                int d = c - '0';
                encoded.append((d * d) % 10);

            } else if (c == ' ') {
                // space becomes a dot
                encoded.append('.');

            } else if (symbols.indexOf(c) >= 0) {
                // symbol: move 2 places forward in ! @ # $ %
                int pos = symbols.indexOf(c);
                encoded.append(symbols.charAt((pos + 2) % symbols.length()));

            } else {
                // any other character stays unchanged
                encoded.append(c);
            }
        }

        String beforeReversal = encoded.toString();
        String password = new StringBuilder(beforeReversal).reverse().toString();

        // ---------- Output ----------
        System.out.println("Shift Key: " + key);
        System.out.println("Before Reversal: " + beforeReversal);
        System.out.println("Encoded Password: " + password);

        input.close();
    }
}