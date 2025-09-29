package Searching.BinarySearch;
public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {10,23,46,46,91,97,140,264};
        int n = arr.length;
        int target = 40;
        int lower = n;// For not found case
        int low = 0, high = n-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>=target){
                lower = Math.min(lower,mid);
                high = mid-1;
            }
            else low = mid+1;
        }
        System.out.println(lower);
    }
}

