package PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumLC1480 {
    /*public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = nums[0];
        for(int i = 1; i < n; i++){
            ans[i] = nums[i] + ans[i-1];
        }
        return ans;
    }*/
    public static int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of input array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Running Sum of array: ");
        int[] ans = runningSum(arr);
        System.out.println(Arrays.toString(ans));
    }
}