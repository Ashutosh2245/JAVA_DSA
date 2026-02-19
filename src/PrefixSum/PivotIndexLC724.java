package PrefixSum;
import java.util.*;
public class PivotIndexLC724 {
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        // Prefix sum building
        for(int i = 1; i < n; i++){
            nums[i] += nums[i-1];
        }
        for(int i = 0; i < n; i++){
            int leftSum = 0;
            if(i > 0) leftSum = nums[i-1]; // leftSum is from 0th to (i-1)th index.

            int rightSum = nums[n-1] - nums[i]; // rightSum is sum from 0 to (n-1)th index elements - sum of 0th to ith index.

            if(leftSum == rightSum) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = pivotIndex(arr);
        System.out.print("Pivot Index: "+ans);
    }
}