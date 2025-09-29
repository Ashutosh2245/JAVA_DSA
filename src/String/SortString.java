package String;
import java.util.Arrays;
public class SortString {
    public static void main(String[] args) {
        String s = "Ashutosh";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();
        StringBuilder sb = new StringBuilder("Ash");
        String s2 = sb.toString();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);
        for(char ele: c2){
            System.out.print(ele);
        }

    }
}
// We cannot directly sort stringBuilder.
// StringBuilder -> String -> Char Array -> Sort