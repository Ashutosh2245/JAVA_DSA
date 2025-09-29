package Searching.BinarySearch;
public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {10,23,46,46,91,97,140,264};
        int n = arr.length;
        int target = 48;
        int upper = n;// For not found case
        int low = 0, high = n-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>target){
                upper = Math.min(upper,mid);
                high = mid-1;
            }
            else low = mid+1;
        }
        System.out.println(upper);
    }
}

