// Find given number is even or odd using ternary operator.
package conditionals;
import java.util.Scanner;
public class ternaryOperator {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        // Condition ? if true: if false
        System.out.println((num%2==0) ? "Even Number" : "Odd Number");
    }
}
//Even number gets printed if condition is true.
//Odd number gets printed if condition is false.