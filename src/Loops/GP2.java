//GP in to general form a, ar,ar2,ar3...... up to n terms.//
package Loops;
import java.util.Scanner;
public class GP2 {
    public static void main(String[] args) {
        int n,i,a,r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms required: ");
        n = sc.nextInt();
        System.out.print("Enter the first term: ");
        a = sc.nextInt();
        System.out.print("Enter the common ratio: ");
        r = sc.nextInt();

        System.out.println("Your GP :");
        for (i=1;i<=n;i++){
            System.out.println(a);
            a*=r;
        }
    }
}
