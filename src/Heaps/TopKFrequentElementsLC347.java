package Heaps;
import java.util.*;
public class TopKFrequentElementsLC347 {
    public static class Pair{
        int ele, freq;
        Pair(int ele, int freq){
            this.ele = ele;
            this.freq = freq;
        }
    }
    public static int[] topKFrequent(int[] nums, int k) {
        /*PriorityQueue <Pair> pq = new PriorityQueue <>(
                (a, b) -> {
                    return a.freq - b.freq;
                }
        );*/

        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.freq));

        HashMap <Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            /* if(map.containsKey(ele)){
                int frequency = map.get(ele);
                map.put(ele, frequency+1);
            }
            else map.put(ele, 1); */

            map.put(ele, map.getOrDefault(ele, 0)+1);
        }

        for(int key : map.keySet()){
            Pair p = new Pair(key, map.get(key));
            pq.add(p);
            if(pq.size() > k) pq.remove();
        }

        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = pq.remove().ele;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter K: ");
        int k = sc.nextInt();
        int[] ans = topKFrequent(arr, k);
        System.out.print("Top "+k+" frequent elements are: ");
        for(int num : ans){
            System.out.print(num + " ");
        }
    }
}
