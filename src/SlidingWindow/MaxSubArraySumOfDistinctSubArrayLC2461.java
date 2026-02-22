package SlidingWindow;
import java.util.*;
public class MaxSubArraySumOfDistinctSubArrayLC2461 {
    public static long maximumSubArraySum(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = k - 1;
        long sum = 0, max = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= right; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        if (map.size() == k) {
            max = sum;
        }
        right++;
        while (right < n) {

            sum = sum - nums[left];
            map.put(nums[left], map.get(nums[left]) - 1);

            if (map.get(nums[left]) == 0)
                map.remove(nums[left]);
            left++;

            sum = sum + nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            if (map.size() == k) {
                max = Math.max(max, sum);
            }
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,4,2,9,9,9};
        int k = 3;
        long ans = maximumSubArraySum(arr, k);
        System.out.print("Max SubArray sum with distinct digits: "+ans);
    }
}
