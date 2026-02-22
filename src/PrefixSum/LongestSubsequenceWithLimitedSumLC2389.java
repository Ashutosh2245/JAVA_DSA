/*
1️⃣ Sort karo
2️⃣ Prefix sum banao
3️⃣ Har query pe binary search
4️⃣ Largest index jaha prefix ≤ query
 */

package PrefixSum;
import java.util.*;
public class LongestSubsequenceWithLimitedSumLC2389 {
    public static int[] answerQueries(int[] arr, int[] queries) {
        Arrays.sort(arr);

        int n = arr.length, m = queries.length;
        for(int i = 1; i < n; i++){
            arr[i] += arr[i-1];
        }

        int[] ans = new int[m];
        for(int i = 0; i < m; i++){
            int low = 0, high = n-1;
            while(low <= high){
                int mid = low + (high - low) / 2;
                if(arr[mid] > queries[i]) {
                    high = mid - 1;
                }
                else{ //(arr[mid] <= queries[i])
                    ans[i] = Math.max(ans[i], mid+1);
                    low = mid+1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,2,1};
        int[] queries = {3,10,21};
        int[] ans = answerQueries(arr, queries);
        System.out.print("Longest Subsequence: ");
        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
}
