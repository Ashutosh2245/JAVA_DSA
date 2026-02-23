package SlidingWindow;
import java.util.*;
public class CountNoOfNiceSubArraysHashMapLC1248 {
    public static int numberOfSubArrays(int[] nums, int k) {

        int prefixSum = 0;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);   // base case

        for (int num : nums) {
            if (num % 2 == 1) {
                prefixSum += 1;
            }

            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        int ans = numberOfSubArrays(arr, k);
        System.out.println("No of nice sub arrays: "+ans);
    }
}