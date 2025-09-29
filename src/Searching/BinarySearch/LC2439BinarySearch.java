package Searching.BinarySearch;
public class LC2439BinarySearch {
    public int minimizeArrayValue(int[] nums) {
        int n = nums.length;
        int maxL = 0;
        int maxR = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            maxR = Math.max(maxR,nums[i]);
        }
        int result = maxR;
        while(maxL<=maxR){
            int mid_max = maxL+(maxR-maxL)/2;
            if(isValid(nums,mid_max,n)){
                result = mid_max;
                maxR = mid_max-1;
            }
            else{
                maxL = mid_max + 1;
            }
        }
        return result;
    }
    public boolean isValid (int[] nums, int mid_max, int n){
        long [] arr = new long[n];
        for(int i=0;i<n;i++) arr[i] = nums[i];

        for(int i=0;i<n-1;i++){
            if(arr[i]>mid_max) return false;
            long buffer = mid_max - arr[i];
            arr[i+1] = arr[i+1] - buffer;
        }
        return arr[n-1]<=mid_max;
    }

    public static void main(String[] args) {
        int[] arr = {3,7,1,6};
        LC2439BinarySearch obj = new LC2439BinarySearch();
        System.out.println(obj.minimizeArrayValue(arr));
    }
}