package Sorting.SelectionSort;
public class StableSelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int minIndex = i;

            // Find minimum element
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Extract minimum element
            int key = arr[minIndex];

            // Shift elements instead of swapping
            while (minIndex > i) {
                arr[minIndex] = arr[minIndex - 1];
                minIndex--;
            }

            arr[i] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 4, 1};

        System.out.print("Original Array: ");
        printArray(arr);

        selectionSort(arr);

        System.out.print("Sorted Array (Stable Ascending): ");
        printArray(arr);
    }
}
