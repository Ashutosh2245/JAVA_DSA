package String;
import java.util.*;
public class SentencePalindrome {
    public static boolean isPalindromeSent(String s) {
        int i = 0;
        int j = s.length() - 1;

        s = s.toLowerCase();

        while (i < j) {

            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Sentence: ");
        String s = sc.nextLine();

        if (isPalindromeSent(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}