package SlidingWindow;
public class NoOfSubArraySizesKAndAverageGreaterThanThresholdLC1343 {
    public static int numOfSubArrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int left = 0, right = k-1, sum = 0;
        int count  = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if((sum/k) >= threshold) count++;

        left++; right++;
        while (right < n){
            sum = sum - arr[left-1] + arr[right];
            if((sum/k) >= threshold) count++;
            left++; right++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {11,13,17,23,29,31,7,5,2,3};
        int k = 3;
        int threshold = 5;
        int ans = numOfSubArrays(arr, k, threshold);
        System.out.print("Number of Sub Arrays: "+ans);
    }
}

