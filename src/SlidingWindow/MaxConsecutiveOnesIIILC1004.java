package SlidingWindow;
public class MaxConsecutiveOnesIIILC1004 {
    public static int longestOnes(int[] nums, int k) {

        int n = nums.length;
        int left = 0, right = 0;
        int zeroCount = 0, maxLen = 0;
        while(right < n){
            if(nums[right] == 0) zeroCount++;

            while(zeroCount > k){
                if(nums[left] == 0) zeroCount--;
                left++;
            }
            int len = right - left + 1;
            maxLen = Math.max(maxLen, len);
            right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int ans = longestOnes(arr, k);
        System.out.println("Max consecutive sub array length: "+ans);
    }
}