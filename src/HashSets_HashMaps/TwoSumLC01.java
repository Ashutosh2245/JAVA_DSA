package HashSets_HashMaps;
import java.util.*;
public class TwoSumLC01{
    public static int[] twoSum (int[] arr, int target){
        int[] ans = {-1,-1};
        HashMap <Integer, Integer> map = new HashMap <>();
        for(int i = 0; i < arr.length; i++){
            int rem = target - arr[i];
            if(map.containsKey(rem)){
                ans[0] = map.get(rem);
                ans[1] = i;
                break;
            }
            else{
                map.put(arr[i],i);
            }
        }
        return ans;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements in array: ");
        int n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        int[] ans = twoSum(arr, target);
        System.out.print("Indices: ");
        for(int num : ans){
            System.out.print(num + " ");
        }
    }
}
