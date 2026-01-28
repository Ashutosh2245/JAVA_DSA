package HashSets_HashMaps;
import java.util.*;
public class FindMaxNoOfStringPairsLC2744 {
    public static int maxNoOfStringPairs(String[] words){
        HashSet <String> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String rev = reverse(words[i]);
            if(set.contains(rev)){
                count++;
                set.remove(rev); // If Words array contains duplicate strings
            }
            else{
                set.add(words[i]);
            }
        }
        return count;
    }
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of strings in array: ");
        int n = sc.nextInt();

        String[] arr = new String[n];
        System.out.print("Enter the strings: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        int ans = maxNoOfStringPairs(arr);
        System.out.print("Max. no of String pairs: "+ans);
    }
}
