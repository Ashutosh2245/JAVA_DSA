package Recursion;
import java.util.*;
public class StringPermutation {
    public static void printPermutations(String ans, String s) {
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            printPermutations(ans+ch, left+right);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printPermutations("",s);
    }
}
