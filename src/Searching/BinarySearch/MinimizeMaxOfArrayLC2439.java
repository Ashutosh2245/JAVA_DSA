package Searching.BinarySearch;
public class MinimizeMaxOfArrayLC2439 {
    public static void main(String[] args) {
        int[] arr = {3,7,1,6};
        System.out.println(minimizeArrayValue(arr));
    }
    public static int minimizeArrayValue(int[] nums) {
        long prefixSum = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            double avg = (double) prefixSum / (i + 1);
            int ceilVal = (int) Math.ceil(avg);
            result = Math.max(result, ceilVal);
        }
        return result;
    }
}
