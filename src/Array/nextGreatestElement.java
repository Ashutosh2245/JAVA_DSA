package Array;
public class nextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {12,8,41,37,2,49,16,28,21};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1; // ans[n-1] = arr[n-1] if we want to print right most element as it is.

        // Method 1 -> Brute Force
        /*for(int i = 0;i<n-1;i++){
            int mx = Integer.MIN_VALUE;
            for(int j = i+1; j<n; j++){
                mx = Math.max(mx,arr[j]);
            }
            ans[i] = mx;
        }*/

        //Method 2 -> Optimized
        int nge = arr[n-1];
        for(int i = n-2;i>=0; i--){
            ans[i] = nge;
            nge = Math.max(nge,arr[i]);
        }

        System.out.print("Array: ");
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.print("\nArray of next greatest elements: ");
        for(int ele: ans){
            System.out.print(ele+" ");
        }
    }
}
