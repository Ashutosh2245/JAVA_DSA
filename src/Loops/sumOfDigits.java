package Loops;
import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        int sum = 0;
        while (num!=0){
            int last_digit = num%10;
            sum += last_digit;
            num=num/10;
        }
        System.out.println("Sum of digits is: " + sum);
    }
}
