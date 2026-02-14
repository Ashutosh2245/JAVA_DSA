package CustomComparator;
import java.util.*;
public class KthClosestPointToOriginLC973 {
    public static class Triplet {
        int x,y,d;
        Triplet(int x, int y){
            this.x = x;
            this.y = y;
            this.d = x*x + y*y;
        }
    }
    public static int[][] kClosest(int[][] points, int k) {
        Comparator <Triplet> cmp = Comparator.comparingInt((Triplet t) -> t.d).reversed();
        PriorityQueue<Triplet> pq = new PriorityQueue<>(cmp);

        for(int i = 0; i < points.length; i++){
            int x = points[i][0], y = points[i][1];

            Triplet trip = new Triplet(x,y);
            pq.add(trip);
            if(pq.size()>k){
                pq.remove();
            }
        }
        int[][] ans = new int[k][2];
        for(int i = 0; i < k; i++){
            Triplet t = pq.remove();
            ans[i][0] = t.x;
            ans[i][1] = t.y;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] points = {{1,3},{-2,2},{5,8},{0,1}};
        int k = 2;

        int[][] ans = KthClosestPointToOriginLC973.kClosest(points, k);

        System.out.println("K closest points:");
        for (int[] p : ans) System.out.println(Arrays.toString(p));
    }

}
