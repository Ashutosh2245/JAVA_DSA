package SlidingWindow;
public class SubArrayProductLessThanKLC713 {
    public static int numSubArrayProductLessThanK(int[] arr, int target) {
        if(target <= 1) return 0;
        int n = arr.length;
        int left = 0, right = 0, prod = 1;
        int count = 0;
        while(right < n){
            prod *= arr[right];

            while(prod >= target && left <= right){
                prod = prod / arr[left];
                left++;
            }
            count += right - left + 1;
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {10,5,2,6};
        int target = 100;
        int ans = numSubArrayProductLessThanK(arr, target);
        System.out.println("Number of Sub array: "+ans);
    }
}
