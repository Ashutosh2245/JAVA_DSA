package SlidingWindow;
public class MaxSubArraySizeSlidingWindow {
    public static long maximumSubArraySum(int[] arr, int k) {

        int n = arr.length;
        int left = 0, right = k-1, sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxSum = sum;

        left++; right++;
        while (right < n){
            sum = sum - arr[left-1] + arr[right];
            maxSum = Math.max(maxSum, sum);
            left++; right++;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,1,3,-40,80,10};
        int k = 3;
        long ans = maximumSubArraySum(arr, k);
        System.out.println("Maximum Sub Array Sum: "+ans);

    }
}
