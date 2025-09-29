package Recursion;
import java.util.*;
public class PreInPost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        pip(n);
    }
    public static void pip(int n){
        if(n==0) return;
        System.out.print(n+" ");
        pip(n-1);
        System.out.print(n+" ");
        pip(n-1);
        System.out.print(n+" ");
    }
}
