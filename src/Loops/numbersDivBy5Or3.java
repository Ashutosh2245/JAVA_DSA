package Loops;
import java.util.Scanner;
public class numbersDivBy5Or3 {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        for (i=1;i<=n;i++){
            if (i%3==0 || i%5==0) System.out.println(i);
        }
    }
}
