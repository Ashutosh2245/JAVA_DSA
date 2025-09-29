package Basics;
import java.util.Scanner;
public class modulusOperator {
    public static void main(String[] args) {
        int a,b,mod;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = scan.nextInt();
        System.out.print("Enter the second number: ");
        b = scan.nextInt();
        mod = a % b;
        System.out.println("Remainder: " + mod);
    }
}
