package Array;
import java.util.*;
public class ThreeSum {
    public static void main(String[] args) {
        int [] arr = {-1,-1,1,0,2};

        List<List<Integer>> ans = threeSum(arr);
        System.out.print(ans);
    }
    public static List<List<Integer>> threeSum(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 2; i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;

            int start = i+1;
            int end = arr.length-1;

            while(start < end){
                int sum = arr[i]+arr[start]+arr[end];

                if(sum==0){
                    result.add(Arrays.asList(arr[i],arr[start],arr[end]));

                    while(start<end && arr[start] == arr[start+1]) start++;
                    while(start<end && arr[end] == arr[end-1]) end--;

                    start++; end--;
                }
                else if(sum<0) start++;
                else end--;
            }
        }
        return result;
    }

}
