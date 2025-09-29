package Basics;
import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args) {
        double p,r,t,SI;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount in Rs.: ");
        p = input.nextDouble();
        System.out.println("Enter the rate: ");
        r = input.nextDouble();
        System.out.println("Enter time in years: ");
        t = input.nextDouble();
        SI = (p*r*t)/100;
        System.out.println("Calculated Simple Interest is: Rs." + SI);
    }
}
