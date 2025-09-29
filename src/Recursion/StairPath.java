// No of ways to climb nth stair.
package Recursion;
import java.util.*;
public class StairPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(stair(n));
    }
    public static int stair(int n){
        if(n<=2) return n;
        return stair(n-1)+stair(n-2);
    }
}
// Only one stair or two stair jump is allowed at a time.
