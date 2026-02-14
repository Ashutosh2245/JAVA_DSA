package Heaps;
import java.util.*;
public class SortArrayByIncreasingFrequencyLC1636 {
    public static class Pair{
        int ele, freq;
        Pair(int ele, int freq){
            this.ele = ele;
            this.freq = freq;
        }
    }
    public static int[] increasingFreq(int[] arr){
        int n = arr.length;
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int ele : arr){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }
        PriorityQueue <Pair> pq = new PriorityQueue<>(
                (a, b) -> {
                    if(a.freq == b.freq){
                        return b.ele - a.ele; // For descending order if freq is same
                    }
                    else return a.freq - b.freq; // Default ascending order
                }
        );
        for(int key : map.keySet()){
            Pair p = new Pair(key, map.get(key));
            pq.add(p);
        }
        int[] ans = new int[n];
        int idx = 0;
        while (!pq.isEmpty()){
            Pair p = pq.remove(); // Select a pair
            for(int i = 0; i < p.freq; i++){
                ans[idx] = p.ele;
                idx++;
            }
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
        int[] answer = increasingFreq(arr);
        System.out.print("New Order in increasing order: ");
        for(int ele : answer){
            System.out.print(ele + " ");
        }
    }
}
// select a pair of (ele, freq)
// Push the ele in array * freq times

