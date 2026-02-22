package PrefixSum;
import java.util.*;
public class SubArraySumEqualsKLC560 {
    public static int subArraySum(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        for(int i = 1; i < n; i++){
            arr[i] += arr[i-1];
        }
        HashMap <Integer, Integer> map = new HashMap <>();
        for(int i = 0; i < n; i++){
            int ele = arr[i];
            if(ele == k) count++;
            int rem = ele - k;
            if(map.containsKey(rem)){
                count += map.get(rem);
            }
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,3,-3,0,7,8,1};
        int k = 7;
        int ans = subArraySum(arr, k);
        System.out.print("SubArray Sum equals "+k+" : "+ ans);
    }
}
