package Recursion;
import java.util.*;
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.println("HCF: "+hcf(num1,num2));


    }
    public static int hcf(int a, int b){
        if(b%a==0) return a;
        return hcf(b%a,a);
    }
}
