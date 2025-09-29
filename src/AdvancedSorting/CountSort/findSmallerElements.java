package AdvancedSorting.CountSort;
import java.util.Arrays;
public class findSmallerElements {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101];
        for (int num : nums) {
            freq[num]++;
        }
        for (int i = 1; i < 101; i++) {
            freq[i] += freq[i - 1];
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (val == 0) {
                result[i] = 0;
            } else {
                result[i] = freq[val - 1];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 2, 11};
        int[] ans = findSmallerElements.smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(ans));
    }
}
