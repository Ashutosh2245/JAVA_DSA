package Searching.BinarySearch;
public class SplitArrayLargestSumLC410 {
    public boolean canAllocate(int[] arr, int m, int mid) {
        int students = 1, pages = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid) return false;
            if (pages + arr[i] > mid) {
                students++;
                pages = arr[i];
                if (students > m) return false;
            } else {
                pages += arr[i];
            }
        }
        return true;
    }
    public int splitArray(int[] arr, int m) {
        if (m > arr.length) return -1;

        int low = 0, high = 0;
        for (int a : arr) {
            low = Math.max(low, a);
            high += a;
        }
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canAllocate(arr, m, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        SplitArrayLargestSumLC410 obj = new SplitArrayLargestSumLC410();
        System.out.println(obj.splitArray(arr,k));
    }
}

