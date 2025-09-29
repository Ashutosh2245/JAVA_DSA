//LeetCode 315
package AdvancedSorting.MergeSort;
import java.util.*;
public class CountSmaller {
    private int[] counts;
    private int[] indices;
    private int[] tempIndices;
    public List<Integer> countSmaller(int[] arr) {
        int n = arr.length;
        counts = new int[n];
        indices = new int[n];
        tempIndices = new int[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        mergeSort(arr, 0, n - 1);
        List<Integer> res = new ArrayList<>();
        for (int c : counts) res.add(c);
        return res;
    }
    private void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
    private void merge(int[] arr, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;
        int rightCount = 0;
        while (i <= mid && j <= right) {
            if (arr[indices[j]] < arr[indices[i]]) {
                tempIndices[k++] = indices[j++];
                rightCount++;
            } else {
                counts[indices[i]] += rightCount;
                tempIndices[k++] = indices[i++];
            }
        }
        while (i <= mid) {
            counts[indices[i]] += rightCount;
            tempIndices[k++] = indices[i++];
        }
        while (j <= right) {
            tempIndices[k++] = indices[j++];
        }
        for (int p = left; p <= right; p++) {
            indices[p] = tempIndices[p];
        }
    }
    public static void main(String[] args) {
        CountSmaller cs = new CountSmaller();
        int[] arr = {5, 2, 6, 1};
        List<Integer> result = cs.countSmaller(arr);
        System.out.println(result);

    }
}
