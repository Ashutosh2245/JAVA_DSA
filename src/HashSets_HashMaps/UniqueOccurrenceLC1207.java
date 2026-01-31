package HashSets_HashMaps;
import java.util.*;
public class UniqueOccurrenceLC1207{
    public static boolean occurrence(int[] arr){
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int ele : arr){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele, freq+1);
            }
            else map.put(ele, 1);
        }

        HashSet <Integer> set = new HashSet<>();
        for(int key : map.keySet()){
            int val = map.get(key);
            set.add(val);
        }
        return map.size() == set.size();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of array elements: ");
        int n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Only unique occurrence is present: ");
        boolean ans = occurrence(arr);
        System.out.print(ans);
    }
}
