package pangram;
import java.util.Scanner;

public class pangramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitivity
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String s) {
        boolean[] letterPresent = new boolean[26]; // 26 letters in the alphabet

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                letterPresent[index] = true;
            }
        }

        for (int i = 0; i < letterPresent.length; i++) {
            if (!letterPresent[i]) {
                return false; // If any letter is not present, it's not a pangram
            }
        }

        return true; // All letters are present
    }
}


