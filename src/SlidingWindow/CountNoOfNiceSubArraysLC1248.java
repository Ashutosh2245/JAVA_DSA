package SlidingWindow;
public class CountNoOfNiceSubArraysLC1248 {
    public static int niceSubArrays(int[] arr, int k){
        int n = arr.length;
        int left = 0, right = 0;
        int count = 0, oddCount = 0;

        while (right < n){
            if(arr[right] % 2 == 1) oddCount++;
            if(oddCount == k){
                int leftEven = 0, rightEven = 0;
                while (left < n && arr[left] % 2 == 0){
                    leftEven++;
                    left++;
                }
                int temp = right + 1;
                while (temp < n && arr[temp] % 2 == 0){
                    rightEven++;
                    temp++;
                }
                count += (leftEven + 1) * (rightEven + 1);
                left++; oddCount--;
            }
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        int ans = niceSubArrays(arr, k);
        System.out.println("No of nice sub arrays: "+ans);
    }
}
