package AdvancedSorting.CycleSort;
public class MissingNumber {
    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int missingNumber(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] < n && arr[i] != i) {
                swap(i, arr[i], arr);
            } else {
                i++;
            }
        }
        for (i = 0; i < n; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(missingNumber(arr));
    }
}
