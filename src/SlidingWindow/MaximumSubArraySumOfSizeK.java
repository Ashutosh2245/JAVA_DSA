package SlidingWindow;
class MaximumSubArraySumOfSizeK {
    public static long maximumSubArraySum(int[] arr, int k) {
        int n = arr.length;
        int maxSum = 0;
        for(int i = 0; i < n-k+1; i++){
            int sum = 0;
            for(int j = i; j < i+k; j++){
                sum += arr[j];
            }
            maxSum = Math.max(maxSum, sum);
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
