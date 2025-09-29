package Loops;
import java.util.Scanner;
public class counting {
    public static void main(String[] args) {
        int n,i;
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        for (i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
