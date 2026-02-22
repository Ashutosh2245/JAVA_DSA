package SlidingWindow;
public class MinSizeSubArraySumLC209 {
    public static int minSubArrayLen(int target, int[] arr) {
        int n = arr.length;
        int left = 0, right = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;
        while(right < n){
            sum += arr[right];

            while(sum >= target){
                int len = right - left + 1;
                minLen = Math.min(minLen, len);
                sum = sum - arr[left];
                left++;
            }
            right++;
        }
        if(minLen == Integer.MAX_VALUE) return 0;
        return minLen;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        int ans = minSubArrayLen(target, arr);
        System.out.print("Sub Array Length: "+ans);
    }
}
