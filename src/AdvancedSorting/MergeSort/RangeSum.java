package AdvancedSorting.MergeSort;
public class RangeSum {
    public static int countRangeSum(int[] nums, int lower, int upper) {
        long[] prefix = new long[nums.length + 1];
        for (int idx = 0; idx < nums.length; idx++) {
            prefix[idx + 1] = prefix[idx] + nums[idx];
        }
        int n = prefix.length;  
        return mergeSortCount(prefix, 0, n - 1, lower, upper);
    }
    private static int mergeSortCount(long[] arr, int left, int right, int lower, int upper) {
        if (left >= right) return 0;
        int mid = (left + right) / 2;
        int count = mergeSortCount(arr, left, mid, lower, upper)
                + mergeSortCount(arr, mid + 1, right, lower, upper);
        int i = left;
        int j = mid + 1;
        int k = mid + 1;
        int t = mid + 1;
        int m = 0;
        long[] merged = new long[right - left + 1];
        for (i = left; i <= mid; i++) {
            while (j <= right && arr[j] - arr[i] < lower) j++;
            while (k <= right && arr[k] - arr[i] <= upper) k++;
            count += k - j;
            while (t <= right && arr[t] < arr[i]) merged[m++] = arr[t++];
            merged[m++] = arr[i];
        }
        while (t <= right) merged[m++] = arr[t++];
        System.arraycopy(merged, 0, arr, left, m);
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {-2, 5, -1};
        int lower = -2, upper = 2;
        System.out.println("Count of Range Sums = " + countRangeSum(nums, lower, upper)); // 3
    }
}

