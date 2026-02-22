package SlidingWindow;
public class LongestSubArrayOf1AfterDeleting1ZeroLC1493 {
    public static int longestSubArray(int[] nums) {
        int n = nums.length;
        int left = 0, right = 0;
        int zeroCount = 0, maxLen = 0;
        while(right < n){
            if(nums[right] == 0) zeroCount++;

            while(zeroCount > 1){
                if(nums[left] == 0) zeroCount--;
                left++;
            }
            int len = right - left;
            maxLen = Math.max(maxLen, len);
            right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,1,1,0,1};
        int ans = longestSubArray(arr);
        System.out.println("Longest sub array length: "+ans);
    }
}