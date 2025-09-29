package String;
import java.util.*;
public class NumberToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = ""+n;
        System.out.println(s);
        String s2 = Integer.toString(n);
        System.out.println(s2);
        System.out.println(s2.length());
        System.out.println(String.valueOf(Math.abs(n)).length());
    }
}

