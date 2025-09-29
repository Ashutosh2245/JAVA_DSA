package Recursion;
import java.util.*;
public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of even numbers: "+EvenSum(a,b));
    }
    public static int EvenSum(int a,int b){
        if (a>b) return 0;
        if (a%2==0) return a+EvenSum(a+1,b);
        else return EvenSum(a+1,b);
    }
}
