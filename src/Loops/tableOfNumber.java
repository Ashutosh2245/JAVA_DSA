package Loops;
import java.util.Scanner;
public class tableOfNumber {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        for (i=1;i<=10;i++){ //Method 1 (10 times iteration).
            System.out.println(n+" x "+i+" = "+(n*i));
        }
        for (i=n;i<=n*10;i+=n){ //Method 2 (10 times iteration).
            System.out.println(i);
        }
    }
}

