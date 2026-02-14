package Heaps;
import java.util.*;
public class LC973ImplementsComparable{
    public static class Triplet implements Comparable<Triplet> {
        int x, y, d;
        Triplet(int x, int y) {
            this.x = x;
            this.y = y;
            this.d = x * x + y * y;
        }
        @Override
        public int compareTo(Triplet other) {
            return other.d - this.d;
        }
    }
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        for (int[] p : points) {
            pq.offer(new Triplet(p[0], p[1]));
            if (pq.size() > k)
                pq.poll();
        }

        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            Triplet t = pq.poll();
            ans[i][0] = t.x;
            ans[i][1] = t.y;
        }
        return ans;
    }
    public static void main(String[] args) {

        int[][] points = {{1,3},{-2,2},{5,8},{0,1}};
        int k = 2;

        int[][] ans = kClosest(points, k);

        System.out.println("K closest points:");
        for (int[] p : ans)
            System.out.println(Arrays.toString(p));
    }
}
