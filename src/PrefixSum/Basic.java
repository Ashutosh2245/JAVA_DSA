package PrefixSum;
import java.util.*;
public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        prefixSum(arr);

    }
    public static void prefixSum(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i-1] + arr[i];
        }
        for(int ele : pref) System.out.print(ele + " ");

    }
}
