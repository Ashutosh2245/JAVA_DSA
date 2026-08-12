package String;
public class NoOfDiffIntegersLC1805 {
    public static void main(String[] args) {
        String s = "abb111cc11122c444cccc5";
        int n = s.length();

        for(int i = 0; i < n; i++){
            s = s.replaceAll("[a-z]", " ");
        }

        System.out.println(s);
    }
}
