package Recursion;
import java.util.Scanner;
public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumOdd(a,b));

    }
    public static int sumOdd(int a, int b){
        if(a>b) return 0; //base case
        if(a%2!=0) return a+sumOdd(a+1,b);
        else return sumOdd(a+1,b);
    }
}
// Method 2 -- Without Recursion

/*package Recursion;
import java.util.*;
public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {   // odd number check
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
*/