package Sorting.BubbleSort;
import java.util.Scanner;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Original Array: ");
        printArray(arr);

        bubbleSort(arr, n);

        System.out.print("\nSorted Array: ");
        printArray(arr);
    }

    static void bubbleSort(int[] arr, int n) {
        if (n == 1) return;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubbleSort(arr, n - 1);
    }

    static void printArray(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
    }
}
