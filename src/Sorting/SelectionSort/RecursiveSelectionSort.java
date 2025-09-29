package Sorting.SelectionSort;
public class RecursiveSelectionSort {
    public static void selectionSort(int[] arr, int start) {
        int n = arr.length;

        // Base case
        if (start >= n - 1) return;

        // Find minimum in the remaining array
        int minIndex = start;
        for (int i = start + 1; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        // Swap
        int temp = arr[minIndex];
        arr[minIndex] = arr[start];
        arr[start] = temp;

        // Recursive call
        selectionSort(arr, start + 1);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};

        System.out.print("Original Array: ");
        printArray(arr);

        selectionSort(arr, 0);

        System.out.print("Sorted Array (Recursive Ascending): ");
        printArray(arr);
    }
}
