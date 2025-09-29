package Searching.BinarySearch;
public class KthMissingPositiveNumberLC1539 {
    public static void main(String[] args) {
        int [] arr = {2,3,4,7,11};
        int k = 5; // Find 5th missing positive number
        int num = missingNum(arr,k);
        System.out.println("Kth missing integer: "+num);

    }
    public static int missingNum(int[] arr, int k){
        int n = arr.length;
        int low = 0, high = n-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            int miss = arr[mid]-(mid+1);
            if(miss>=k) high = mid-1;
            else low = mid+1;
        }
        return k+low;
    }
}
