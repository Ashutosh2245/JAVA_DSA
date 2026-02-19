package PrefixSum;
import java.util.*;
public class ScoreOfAllPrefixesLC2640 {
    public static long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        int max = 0;
        long prefixSum = 0;
        long[] ans = new long[n];
        for(int i = 0; i < n; i++){
            max = Math.max(max,nums[i]);
            prefixSum += nums[i]  + max;
            ans[i] = prefixSum;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        long[] ans = findPrefixScore(arr);
        System.out.print("Resultant Array: ");
        for(long ele : ans){
            System.out.print(ele + " ");
        }
    }
}
