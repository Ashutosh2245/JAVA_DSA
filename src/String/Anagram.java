package String;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first str: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second str: ");
        String s2 = sc.nextLine();

        Anagram obj = new Anagram();
        boolean ans = obj.check(s1,s2);

        if(ans) System.out.println("Anagram");
        else System.out.println("Not an anagram");
    }
    public boolean check(String s, String t){
        if(s.length() != t.length()) return false;

        s = s.replaceAll("\\s+", "").toLowerCase();
        t = t.replaceAll("\\s+", "").toLowerCase();

        char [] c1 = s.toCharArray();
        char [] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; i++) {
            if(c1[i]!=c2[i]) return  false;
        }
        return Arrays.equals(c1,c2);
    }
}
