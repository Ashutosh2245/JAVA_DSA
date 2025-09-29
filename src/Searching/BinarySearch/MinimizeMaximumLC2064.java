package Searching.BinarySearch;
public class MinimizeMaximumLC2064 {
    public static boolean isPossible(int[]arr, int n, int maxQuant){
        int stores = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%maxQuant == 0) stores += arr[i]/maxQuant;
            else stores += arr[i]/maxQuant +1;
        }
//        if(stores>n) return false;
//        else return true;
        return  stores<=n;
    }
    public static int minimize(int[] arr, int n){
        int m = arr.length,mx = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            mx = Math.max(mx,arr[i]);
        }
        int low = 1, high = mx;
        int ans = 0;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(isPossible(arr,n,mid)){
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {15,10,10};
        int n = 7;
        int answer = minimize(arr,n);
        System.out.println(answer);
    }
}
