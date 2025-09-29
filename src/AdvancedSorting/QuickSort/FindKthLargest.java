package AdvancedSorting.QuickSort;
public class FindKthLargest {
    static int ans;
    public int findKthLargest(int[] arr, int k) {
        ans = -1;
        int n = arr.length;
        quickSelect(arr, 0, n - 1, n - k);
        return ans;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, high);
        return i;
    }
    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void quickSelect(int[] arr, int low, int high, int k) {
        if (low > high) return;
        int idx = partition(arr, low, high);
        if (idx == k) {
            ans = arr[idx];
            return;
        }
        if (k < idx) quickSelect(arr, low, idx - 1, k);
        else quickSelect(arr, idx + 1, high, k);
    }
    public static void main(String[] args) {
        int[] arr = {4, 9, 7, 1, 2, 3, 6, 5, 8};
        print(arr);
        int k = 4;
        FindKthLargest obj = new FindKthLargest();
        int result = obj.findKthLargest(arr, k);
        print(arr);
        System.out.println("Kth largest element is: " + result);
    }

}
