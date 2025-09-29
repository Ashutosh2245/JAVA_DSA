package Searching.BinarySearch;
import java.util.Arrays;
public class FirstAndLastOccurrence2 {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,70,80,90,100};
        int target = 110;
        FirstAndLastOccurrence2 obj = new FirstAndLastOccurrence2();
        int [] ans = obj.occurrence(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    public int[] occurrence(int[] arr, int target){
        int n = arr.length;
        int[] ans = new int[2];
        int fp =-1, low =0, high = n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                if(mid>0 && arr[mid]==arr[mid-1]) high = mid-1;
                else{
                    fp =mid;
                    break;
                }
            }
            else if(arr[mid]<target) low = mid+1;
            else if (arr[mid]>target) high = mid-1;
        }
        int lp =-1; low =0; high = n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                if(mid+1<n && arr[mid]==arr[mid+1]) low = mid+1;
                else{
                    lp =mid;
                    break;
                }
            }
            else if(arr[mid]<target) low = mid+1;
            else if (arr[mid]>target) high = mid-1;
        }
        ans[0] = fp; ans[1] = lp;
        return ans;
    }
}
