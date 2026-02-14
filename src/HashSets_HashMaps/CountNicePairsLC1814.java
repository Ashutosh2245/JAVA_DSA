package HashSets_HashMaps;
import java.util.*;
public class CountNicePairsLC1814 {
    public static int countNicePairs(int[] nums) {
        int count = 0;
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            int ele = num - reverse(num);
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                count += freq;
                count %= 1000000007;
                map.put(ele, freq+1);
            }
            else map.put(ele, 1);
        }
        return count;
    }
    public static int reverse(int n){
        int rev = 0;
        while(n > 0){
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = countNicePairs(arr);
        System.out.print("No of nice pairs: "+ans);
    }
}
