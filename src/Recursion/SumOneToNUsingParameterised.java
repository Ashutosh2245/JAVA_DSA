//package Recursion;
//import java.util.*;
//public class SumOneToNUsingParameterised {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sum(n,0);
//    }
//    public static void sum(int n, int s){
//        if(n<=0) {
//            System.out.println(s);
//            return;
//        }
//        sum(n-1, s+n);
//    }
//}

// METHOD 2//

package Recursion;
import java.util.*;
public class SumOneToNUsingParameterised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if(n==1 || n==0) return n;
        return n + sum(n-1);
    }
}
