package Sorting.BubbleSort;
import java.util.Scanner;
public class OptimizedBubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Original Array: ");
        printArray(arr);
        bubbleSort(arr);
        System.out.print("\nSorted Array: ");
        printArray(arr);
    }
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // already sorted
        }
    }
    static void printArray(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
    }
}

