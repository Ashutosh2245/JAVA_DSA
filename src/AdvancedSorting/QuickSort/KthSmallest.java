package AdvancedSorting.QuickSort;
public class KthSmallest {
    static int ans;
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
    public static void quickSelect(int[] arr, int low, int high,int k){
        if(low>high) return;
//        if(low==high){ // Not really required
//            if(low==k-1) ans = arr[low];
//            return;
//        }
        int idx = partition(arr,low,high);
        if(idx==k-1){
            ans = arr[idx];
            return;
        }
        if(k-1<idx) quickSelect(arr,low,idx-1,k);
        else quickSelect(arr,idx+1,high,k);
    }

    public static void main(String[] args) {
        int[] arr= {4,9,7,1,2,3,6,5,8};
        int n =arr.length;
        print(arr);
        int k = 4;
        ans = -1;
        quickSelect(arr,0,n-1,k);
        print(arr);
        System.out.println("Kth smallest element is: "+ans);
    }
}

