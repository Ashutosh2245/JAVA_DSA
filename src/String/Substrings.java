package String;
public class Substrings {
    public static void main(String[] args) {
        String s ="abcde";
        System.out.println(s.substring(2));
        System.out.println(s.substring(0,5));
        for(int i=0;i<s.length();i++){
            for(int j = i+1;j<=s.length();j++){
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
        System.out.println(10+20+"Hello");
        System.out.println("Hello"+10+20);
    }
}
