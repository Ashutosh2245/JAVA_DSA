/// Display the AP - 1,3,5,7,9,....... uo to n numbers of terms.
package Loops;
import java.util.Scanner;
public class arithmeticProgression {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms required: " );
        n = sc.nextInt();
        for (i=1;i<=2*n-1;i+=2){ //nth term of AP is = 2n-1 using formula nth term(An) = a+(n-1)*d //
            System.out.print(i+" ");
        }
    }
}

