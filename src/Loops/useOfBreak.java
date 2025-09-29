//Check a number is composite or not//
package Loops;
import java.util.Scanner;
public class useOfBreak {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        int n;
        System.out.print("Enter the number: ");
        n = sc.nextInt();

        for (int i = 2;i<=n-1;i++){
            if(n%i==0) {
                System.out.println(n + " is a Composite Number.");
                break;
            }
        }
    }
}
// For composite number a number should at least one factor except 1 and that number.
// Therefor range will be from 2 to n-1.
// If we don't use break statement then the output will be print that much times how much times the if condition is true.