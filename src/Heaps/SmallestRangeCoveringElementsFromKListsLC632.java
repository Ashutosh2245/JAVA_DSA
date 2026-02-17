package Heaps;
import java.util.*;
public class SmallestRangeCoveringElementsFromKListsLC632 {
    public static class Triplet implements Comparable <Triplet>{
        int ele, row, col;
        Triplet(int ele, int row, int col){
            this.ele = ele;
            this.row = row;
            this.col = col;
        }
        public int compareTo(Triplet t){
            return this.ele - t.ele;
        }
    }
    public static int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue <Triplet> pq = new PriorityQueue<>();
        int k = nums.size();
        int[] ans = {0, Integer.MAX_VALUE};

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < k; i++){
            int ele = nums.get(i).get(0);
            pq.add(new Triplet(ele, i, 0));
            max = Math.max(max, ele);

        }
        while(true){
            Triplet top = pq.remove();
            int ele = top.ele, row = top.row, col = top.col;
            if(max - ele < ans[1] - ans[0]){
                ans[1] = max;
                ans[0] = ele;
            }

            if(col == nums.get(row).size()-1){
                break;
            }

            int next = nums.get(row).get(col+1);
            pq.add(new Triplet(next, row, col+1));
            max = Math.max(max, next);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lists (k): ");
        int k = sc.nextInt();

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            System.out.print("Enter size of list " + (i + 1) + ": ");
            int size = sc.nextInt();

            List<Integer> temp = new ArrayList<>();

            System.out.print("Enter " + size + " sorted elements: ");
            for (int j = 0; j < size; j++) {
                temp.add(sc.nextInt());
            }
            list.add(temp);
        }
        System.out.println();
        int[] ans = smallestRange(list);
        System.out.println("Smallest Range: " + ans[0] + " " + ans[1]);

        sc.close();
    }
}
