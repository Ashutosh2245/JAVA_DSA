package Basics;
import java.util.Scanner;
public class sumOfTwoNumbersInput {
    public static void main(String[] args) {
        int a,b,sum;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = scan.nextInt();
        System.out.print("Enter the second number: ");
        b = scan.nextInt();
        sum = a + b;
        System.out.println("Sum of given numbers is: " + sum);
    }
}
