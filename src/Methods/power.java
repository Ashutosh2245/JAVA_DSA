package Methods;
import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int pow = 1;
        // For finding a**b; (a) to the power b.
        if ( a==0 && b==0) System.out.println("Invalid Input.");
        else {
            for (int i = 1; i <= b; i++) {
                pow *= a;
            }
            System.out.println("a*b = " + pow);
        }
    }
}
// It can be also find using (Math.pow(a,b))