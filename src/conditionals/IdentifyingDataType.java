package conditionals;
import java.util.Scanner;
public class IdentifyingDataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Check digit
        if (Character.isDigit(ch)) {
            System.out.println("Integer");
        }
        // Check alphabet
        else if (Character.isLetter(ch)) {
            char lower = Character.toLowerCase(ch);
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }
        // Otherwise special character
        else {
            System.out.println("Special Character");
        }

        sc.close();
    }
}
