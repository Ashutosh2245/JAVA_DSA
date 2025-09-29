package String;
import java.util.Scanner;
public class InputStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        StringBuilder tb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
        System.out.println(tb);
        sb.setCharAt(1,'a');
        System.out.println(sb);
    }
}
