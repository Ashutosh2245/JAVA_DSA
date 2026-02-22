package PrefixSum;
import java.util.*;
public class ProductOfArrayExceptSelfLC238 {
    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] pre = new int[n];
        pre[0] = 1;
        for(int i = 1; i < n; i++){
            pre[i] = arr[i-1] * pre[i-1];
        }

        int[] suf = new int[n];
        suf[n-1] = 1;
        for(int i = n-2; i >= 0; i--){
            suf[i] = arr[i+1] * suf[i+1];
        }

        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = pre[i] * suf[i];
        }

        return ans;
    }

    /*

    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] pre = new int[n];
        pre[0] = 1;
        for(int i = 1; i < n; i++){
            pre[i] = arr[i-1] * pre[i-1];
        }

        int suf = 1;
        for(int i = n-2; i >= 0; i--){
            suf *= arr[i+1];
            pre[i] *= suf;
        }

        return pre;
    }

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements in array: ");
        int n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = productExceptSelf(arr);
        System.out.print("Resultant Array: ");
        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
}
