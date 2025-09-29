package AdvancedSorting.MergeSort;
public class MergeSort {
    // Function to print array
    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    // Merge Sort function
    public static void mergesort(int[] arr) {
        int n = arr.length;
        if (n == 1) return; // base case

        // Split array into two halves
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];
        for (int i = 0; i < n / 2; i++) a[i] = arr[i];
        for (int i = 0; i < n - n / 2; i++) b[i] = arr[i + n / 2];
        // Recursive calls
        mergesort(a);
        mergesort(b);
        // Merge step
        merge(a, b, arr);
    }
    // Function to merge two sorted arrays
    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];
    }
    // Main method
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 2, 6, 1, 7, 4};
        System.out.print("Before Sorting: ");
        print(arr);
        mergesort(arr);
        System.out.print("After Sorting:  ");
        print(arr);
    }
}
