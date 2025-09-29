//Print even numbers from 1 to n.
package Loops;
import java.util.Scanner;
public class evenNumbers {
    public static void main(String[] args) {
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        for (i=1;i<=n;i++){ // Method 1 (n times iteration).
            if (i%2==0) System.out.println(i);
        }
        for (i=2;i<=n;i+=2){ // Method 2 (n/2 times iteration).
            System.out.println(i);
        }
    }
}
