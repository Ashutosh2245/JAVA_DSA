package HashSets_HashMaps;
import java.util.*;
public class LongestSubStringLC03 {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n <= 1) return n;

        int maxLen = 0;
        int i = 0, j = 0;

        HashMap <Character, Integer> map = new HashMap<>();
        while(j < n){
            char ch = s.charAt(j);
            if(map.containsKey(ch) && map.get(ch) >= i){
                int len = j-i;
                maxLen = Math.max(len, maxLen);
                while(s.charAt(i) != ch){
                    i++;
                }
                i++;
            }
            map.put(ch, j);
            j++;
        }
        int len = j-i;
        maxLen = Math.max(len, maxLen);

        return maxLen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        int ans = lengthOfLongestSubstring(s);
        System.out.print("Longest substring without repeating character: "+ans);
    }
}