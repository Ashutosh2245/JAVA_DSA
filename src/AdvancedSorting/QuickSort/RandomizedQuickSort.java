package AdvancedSorting.QuickSort;
import java.util.Random;
public class RandomizedQuickSort {
    static Random rand = new Random();
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int randomizedPartition(int[] arr, int lo, int hi){
        int randomIdx = lo + rand.nextInt(hi - lo + 1);
        swap(arr, lo, randomIdx);
        int pivot = arr[lo];
        int smallerCount = 0;
        for(int i = lo + 1; i <= hi; i++){
            if(arr[i] <= pivot) smallerCount++;
        }
        int correctIdx = lo + smallerCount;
        swap(arr, lo, correctIdx);
        int i = lo, j = hi;
        while(i < correctIdx && j > correctIdx){
            if(arr[i] <= pivot) i++;
            else if(arr[j] > pivot) j--;
            else swap(arr, i, j);
        }
        return correctIdx;
    }
    public static void quickSort(int[] arr, int lo, int hi){
        if(lo >= hi) return;
        int idx = randomizedPartition(arr, lo, hi);
        quickSort(arr, lo, idx - 1);
        quickSort(arr, idx + 1, hi);
    }
    public static void main(String[] args){
        int[] arr = {5, 3, 8, 4, 2, 7, 1, 10};
        System.out.println("Before sorting:");
        for(int num : arr) System.out.print(num + " ");
        System.out.println();

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After sorting:");
        for(int num : arr) System.out.print(num + " ");
    }
}

