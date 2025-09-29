package AdvancedSorting.MergeSort;
public class InversionCount {
    public static int mergeSortAndCount(int[] arr, int l, int r) {
        int count = 0;
        if (l < r) {
            int mid = (l + r) / 2;
            count += mergeSortAndCount(arr, l, mid);
            count += mergeSortAndCount(arr, mid + 1, r);
            count += mergeAndCount(arr, l, mid, r);
        }
        return count;
    }
    private static int mergeAndCount(int[] arr, int l, int mid, int r) {
        int[] left = java.util.Arrays.copyOfRange(arr, l, mid + 1);
        int[] right = java.util.Arrays.copyOfRange(arr, mid + 1, r + 1);

        int i = 0, j = 0, k = l, swaps = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                swaps += (mid + 1) - (l + i);  // count inversions
            }
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];

        return swaps;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(mergeSortAndCount(arr, 0, arr.length - 1)); // 3
    }
}
