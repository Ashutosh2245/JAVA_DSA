package Searching.BinarySearch;
import java.util.*;
public class AggressiveCows {
    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;
        int start = 1;
        int end = stalls[n-1]-stalls[0];
        int ans = 0;
        while(start<=end){
            int mid = start+(end-start)/2;
            int count = 1;
            int pos = stalls[0];
            for(int i=1;i<n;i++){
                if(pos+mid<=stalls[i]){
                    count++;
                    pos = stalls[i];
                }
            }
            if (count<k){
                end = mid-1;
            }
            else{
                ans = mid;
                start = mid+1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9}; // stalls
        int k = 3; // no of cows
        AggressiveCows obj = new AggressiveCows();
        int answer = obj.aggressiveCows(arr,k);
        System.out.println(answer);
    }
}

