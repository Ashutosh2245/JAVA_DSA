package String;
import java.util.*;
public class CheckIfAStringContainsAllBinaryCodesLC1461 {
    public static boolean isContains(String s, int k){
        int required = (int) Math.pow(2,k);
        HashSet <String> set = new HashSet<>();
        for (int i = 0; i <= s.length() - k; i++){
            String sub = s.substring(i, i+k);
            set.add(sub);
        }
        System.out.println("Sub String Set: "+set);

        return set.size() == required;
    }

    public static void main(String[] args) {
        String s = "1000111010";
        int k = 3;
        boolean ans = isContains(s, k);
        System.out.println("Is contains: "+ans);
    }
}
