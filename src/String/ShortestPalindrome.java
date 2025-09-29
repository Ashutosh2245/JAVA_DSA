package String;
public class ShortestPalindrome {
    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static String shortestPalindrome(String s) {
        int n = s.length();
        int maxLen = 0;

        // Find the longest palindrome starting at index 0
        for (int i = n; i > 0; i--) {
            if (isPalindrome(s.substring(0, i))) {
                maxLen = i;
                break;
            }
        }

        // Reverse the remaining suffix and prepend
        String suffix = s.substring(maxLen);
        String reversedSuffix = new StringBuilder(suffix).reverse().toString();

        return reversedSuffix + s;
    }

    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(shortestPalindrome(s)); // Output: "dcbabcd"
    }
}
