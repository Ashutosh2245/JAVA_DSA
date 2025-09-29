package String;
import java.util.Scanner;
public class atoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        atoi obj = new atoi();
        System.out.println(obj.myAtoi(s));
    }

    public int myAtoi(String s){
        int n = s.length(), i = 0, sign = 1;
        long result = 0;

        while(i<n && s.charAt(i)==' ') i++;

        if(i<n){
            if(s.charAt(i)=='-'){
                sign = -1;
                i++;
            }
            else if(s.charAt(i)=='+'){
                i++;
            }
        }

        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            result = result*10+digit;
            i++;

            if(sign*result >Integer.MAX_VALUE) return Integer.MAX_VALUE;
            else if(sign*result<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return (int) (sign*result);
    }
}
//Ascii of '0' is 48 and '1' is 49

