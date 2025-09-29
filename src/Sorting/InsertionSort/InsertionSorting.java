package Sorting.InsertionSort;
import java.util.Arrays;
public class InsertionSorting {
    public static void print(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void swap (int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {-10,-4,-20,78,-6,-8};
        int n = arr.length;
        print(arr);
        //Insertion Sort
//        for (int i = 1; i < n; i++) {
//            for (int j = i; j >=1 ; j--) {
//                if(arr[j]<arr[j-1])
//                    swap(arr,j,j-1);
//                else break;
//            }
//        }
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j>=1&&arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
        }
        print(arr);
    }
}
