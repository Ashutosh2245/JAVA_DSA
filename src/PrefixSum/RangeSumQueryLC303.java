package PrefixSum;
import java.util.*;

class NumArray {
    int[] arr;

    public NumArray(int[] nums) {
        arr = Arrays.copyOf(nums, nums.length);

        for(int i = 1; i < arr.length; i++){
            arr[i] += arr[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        if(left == 0) return arr[right];

        return arr[right] - arr[left - 1];
    }
    // Range sum -> 0th index to right index - 0th index to left

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        NumArray obj = new NumArray(nums);

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        while(q-- > 0) {
            System.out.print("Enter left index: ");
            int left = sc.nextInt();

            System.out.print("Enter right index: ");
            int right = sc.nextInt();

            int result = obj.sumRange(left, right);
            System.out.println("Sum in range = " + result);
        }
    }
}
