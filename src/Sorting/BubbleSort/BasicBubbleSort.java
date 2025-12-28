package Sorting.BubbleSort;
import java.util.Scanner;
public class BasicBubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array: ");
        printArray(arr);
        bubbleSort(arr);
        System.out.print("\nSorted Array: ");
        printArray(arr);
    }
    static void bubbleSort(int[] arr){
        for(int i=0; i< arr.length-1;i++){
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
