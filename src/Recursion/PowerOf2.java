package Recursion;
import java.util.*;
public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(power(num));
    }
    public static boolean power(int n){
        if(n==1) return true; //base case
        if(n<=0 || n%2!=0) return false;
        return power(n/2);
    }
}
