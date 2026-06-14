package Greedy;
import java.util.*;
public class MaxSumOfArrayAfterKNegotiationsLC1005 {

    public static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        int i = 0;
        while (i < nums.length && nums[i] < 0 && k > 0) {
            nums[i] = -nums[i];
            i++;
            k--;
        }

        int sum = 0;
        int mn = Integer.MAX_VALUE;

        for (int x : nums) {
            sum += x;
            mn = Math.min(mn, x); // Fix
        }

        if ((k & 1) == 1) {
            sum -= 2 * mn;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter K: ");
        int k = sc.nextInt();
        int ans = largestSumAfterKNegations(arr, k);
        System.out.println("Answer: "+ans);
    }
}