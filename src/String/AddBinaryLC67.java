package String;
import java.util.*;
public class AddBinaryLC67 {
    public static String addBinary(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        int i = s1.length() - 1;
        int j = s2.length() - 1;

        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1){
            int sum = carry;

            if(i >= 0 ) {
                sum += s1.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                sum += s2.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first binary string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second binary string: ");
        String s2 = sc.nextLine();

        String result = addBinary(s1, s2);
        System.out.print("Resultant Binary String: "+result);

    }
}
