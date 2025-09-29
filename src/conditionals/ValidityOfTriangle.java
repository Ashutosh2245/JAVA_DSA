package conditionals;
import java.util.Scanner;
public class ValidityOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a+b>c && b+c> a && a+c>b ){
            System.out.print("Triangle will be formed.");

            if(a==b && b==c && a==c) System.out.print("\nEquilateral Triangle.");
            else if (a==b || b==c || a==c) System.out.print("\nIsosceles triangle.");
            else System.out.print("\nScalene Triangle.");
        }
        else System.out.print("Invalid Triangle.");

    }
}
