package Heaps;
import java.util.*;
public class KthLargestElementInStreamLC703 {
    private int k;
    private PriorityQueue<Integer> pq;

    public KthLargestElementInStreamLC703(int k, int[] arr) {
        this.k = k;
        pq = new PriorityQueue<>();

        for (int ele : arr) {
            pq.add(ele);
            if (pq.size() > k) {
                pq.remove();
            }
        }
    }
    public int add(int val) {
        pq.add(val);
        if (pq.size() > k) {
            pq.remove();
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        KthLargestElementInStreamLC703 obj = new KthLargestElementInStreamLC703(k, arr);
        System.out.print("How many values to add in stream? ");
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.print("Enter value to add: ");
            int val = sc.nextInt();
            System.out.println("Kth largest element is: " + obj.add(val));
        }
    }
}
