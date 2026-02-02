package HashSets_HashMaps;
import java.util.*;
public class ArrayPairsAreDivByKLC1497 {
    public static boolean canArrange(int[] arr, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            int ele = num % k;

            if (ele < 0) ele += k; //Handling Negatives

            if(map.containsKey(ele)){
                map.put(ele, map.get(ele)+1);
            }
            else map.put(ele, 1);
        }
        // remainder 0 case
        if(map.containsKey(0)){
            if(map.get(0)%2 != 0) return false;
            map.remove(0);
        }
        // remainder (k/2) case
        if(k % 2 == 0 && map.containsKey(k/2)){
            if(map.get(k/2)%2 != 0) return false;
            map.remove(k/2);
        }

        for(int key : map.keySet()){
            int rem = k - key;
            if(!map.containsKey(rem)) return false;
            int keyFreq = map.get(key);
            int remFreq = map.get(rem);
            if(keyFreq != remFreq) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        boolean ans = canArrange(arr, k);
        System.out.println(ans);
    }
}
