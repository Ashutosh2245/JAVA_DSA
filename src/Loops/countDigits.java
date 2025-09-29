package Loops;
import java.util.Scanner;
public class countDigits {
    public static void main(String[] args) {
        long n;
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter your number: ");
        n = sc.nextLong();

        int count =0;
        while(n!=0){
            n=n/10;
            count=count+1;
        }
        System.out.println("No of digits in number: " + count);
    }
}
// We used long because int can not count long number of digits.