package AdvancedSorting.QuickSort;
public class QuickSortAlgo {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[] arr){
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static int partition(int[] arr, int low, int high){
        int mid = (low+high)/2;
        int pivot = arr[mid], pivotIdx = mid;
        int smallerCount = 0;
        for (int i = low; i <= high; i++) {
            if(i==mid) continue;
            if(arr[i]<=pivot) smallerCount++;
        }
        int correctIdx = low+smallerCount;
        swap(arr,pivotIdx,correctIdx);
        int i = low, j = high;
        while (i<correctIdx && j>correctIdx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]> pivot && arr[j]<=pivot){
                swap(arr,i,j);
            }
        }
        return correctIdx;
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low>=high) return;
        int idx = partition(arr,low,high);
        quickSort(arr,low,idx-1);
        quickSort(arr,idx+1,high);
    }

    public static void main(String[] args) {
        int[] arr= {4,9,7,1,2,3,6,5,8};
        int n =arr.length;
        print(arr);
        quickSort(arr,0,n-1);
        print(arr);
    }
}
