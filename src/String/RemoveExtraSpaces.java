package String;
import java.util.*;
public class RemoveExtraSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        String ans = removeSpace(s);
        System.out.println(ans);

    }
    public static String removeSpace(String s){
        return s.trim().replaceAll("\\s+"," ");
    }
}
