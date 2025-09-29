package Recursion;
import java.util.Scanner;
public class IncreasingNumberUsingRecursiveCall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        print(n);

    }
    public static void print(int n){
        if(n<=0) return;
        System.out.println(n); //This will print n to 1
        print(n-1);
        System.out.println(n); // This will print 1 to n
    }
}
