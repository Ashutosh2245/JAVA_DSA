package Heaps;
import java.util.*;
public class FindKClosestElementsLC658 {
    public static class Pair{
        int ele, diff;
        Pair(int ele, int diff){
            this.ele = ele;
            this.diff = diff;
        }
    }
    public static ArrayList <Integer> kClosest(int[] arr, int k ,int x){
        PriorityQueue <Pair> pq = new PriorityQueue<>(
                (a, b) -> {
                    if(a.diff == b.diff){
                        return b.ele - a.ele;
                    }
                    return b.diff - a.diff;
                }
        );
        for(int ele : arr){
            int difference = Math.abs(x - ele);
            Pair p = new Pair(ele, difference);
            pq.add(p);
            if(pq.size() > k){
                pq.remove();
            }
        }
        ArrayList <Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()){
            ans.add(pq.remove().ele);
        }
        Collections.sort(ans);
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
        System.out.print("Enter the number (Whose K closest element is needed): ");
        int num = sc.nextInt();
        System.out.print("Enter K: ");
        int k = sc.nextInt();
        ArrayList <Integer> answer = kClosest(arr,k,num);
        System.out.print("K closest elements are: "+answer);

    }
}
