//package Recursion;
//import java.util.*;
//public class Power {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Base: ");
//        int a = sc.nextInt();
//        System.out.print("Enter Power: ");
//        int b = sc.nextInt();
//        System.out.println(power(a,b));
//    }
//    public static int power(int a, int b){
//        if(b==0) return 1;
//        //else return a*(int)Math.pow(a,b-1);
//        else return a*power(a,b-1);
//    }
//}
//Time Complexity == O(b)

//Method 2 -->> Logarithmic Function
package Recursion;
import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int a = sc.nextInt();
        System.out.print("Enter Power: ");
        int b = sc.nextInt();
        System.out.println(pow(a,b));
    }
    public static int pow(int a, int b){
        if(b==0) return 1;
        int ans = pow(a,b/2);
        if(b%2==0) return ans*ans;
        else return ans*ans*a;
    }
}
//Time Complexity == O(log b)