package Greedy;
import java.util.*;
public class RabbitsInForestLC781 {
    public static int numRabbits(int[] answers) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : answers) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int ans = 0;

        for (int x : map.keySet()) {
            int count = map.get(x);
            int groupSize = x + 1;
            int groups = (count + groupSize - 1) / groupSize;
            ans += groups * groupSize;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] answers = {1, 1, 2};
        System.out.println(numRabbits(answers));
    }
}
