package AdvancedSorting.CycleSort;
public class CyclicSort {
    public static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        System.out.println("Before sorting:");
        printArray(arr);
        cyclicSort(arr);
        System.out.println("After sorting:");
        printArray(arr);
    }
}

