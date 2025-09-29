//Print GP 2,4,8,16,........ up to n terms.
package Loops;
import java.util.Scanner;
public class GP {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms required: ");
        n = sc.nextInt();
        int a = 2, r = 2;
        for (i=1;i<=n;i++){
            System.out.println(a);
            a*=r;
        }
    }
}
