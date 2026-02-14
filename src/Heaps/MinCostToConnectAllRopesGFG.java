package Heaps;
import java.util.*;
public class MinCostToConnectAllRopesGFG {
    public static int minCost(int[] arr){
        int cost = 0;
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        for(int ele : arr){
            pq.add(ele);
        }
        while (pq.size() > 1){
            int a = pq.remove();
            int b = pq.remove();
            int c = a+b;
            pq.add(c);
            cost += c;
        }
        return cost;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of ropes in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the ropes: ");
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Minimum cost to connect all ropes:  ");
        int ans = minCost(arr);
        System.out.print(ans);
    }
}
