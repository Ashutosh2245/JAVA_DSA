package Searching.BinarySearch;
import java.util.Arrays;
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,70};
        int target = 60;
        FirstAndLastPosition obj = new FirstAndLastPosition();
        int [] ans =obj.upperLower(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    //checking if target is present or not.
    public int[] upperLower(int[] arr, int target){
        int[] ans = {-1,-1};
        int n = arr.length;
        //Checking if target is present or not
        int low = 0, high = n-1;
        boolean flag = false;
        while (low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) high = mid-1;
            else if(arr[mid]< target) low = mid+1;
            else{
                flag = true;
                break;
            }
        }
        if(!flag) return ans;
        //Lower bound
        int lower = n;// For not found case
        low = 0; high = n-1;
        while (low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                lower = Math.min(lower, mid);
                high = mid - 1;
            } else low = mid + 1;
        }
        ans[0] = low;
        //Upper bound
        int upper = n;// For not found case
        low = 0; high = n-1;
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                upper = Math.min(upper, mid);
                high = mid - 1;
            } else low = mid + 1;
        }
        ans[1] = upper-1;
        return ans;
    }
}
