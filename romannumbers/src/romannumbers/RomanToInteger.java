
package romannumbers;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase(); 
        int result = romanToInteger(romanNumeral);
        System.out.println("Integer value: " + result);
    }

    public static int romanToInteger(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == 'I') {
                result += 1;
            } else if (currentChar == 'V') {
                result += 5;
                if (i > 0 && s.charAt(i - 1) == 'I') {
                    result -= 2; 
                }
            } else if (currentChar == 'X') {
                result += 10;
                if (i > 0 && s.charAt(i - 1) == 'I') {
                    result -= 2; 
                }
            } else if (currentChar == 'L') {
                result += 50;
            } else if (currentChar == 'C') {
                result += 100;
                if (i > 0 && s.charAt(i - 1) == 'X') {
                    result -= 20; 

                }
            } else if (currentChar == 'D') {
                result += 500;
            } else if (currentChar == 'M') {
                result += 1000;
                if (i > 0 && s.charAt(i - 1) == 'C') {
                    result -= 200; 
                }
            } else {
                System.err.println("Invalid Roman numeral character: " + currentChar);
                System.exit(1);
            }
        }

        return result;
    }
}