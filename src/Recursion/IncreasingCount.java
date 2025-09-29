package Recursion;
import java.util.Scanner;
public class IncreasingCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        print(1,n);

    }
    public static void print(int st, int end){
        if(st>end) return;
        System.out.println(st);
        print(st+1,end);
    }
}


