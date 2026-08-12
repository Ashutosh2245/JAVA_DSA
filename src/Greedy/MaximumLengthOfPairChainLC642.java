package Greedy;
import java.util.*;
public class MaximumLengthOfPairChainLC642 {
    public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));

        int chainLength = 1;
        int currEnd = pairs[0][1];

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > currEnd) {
                chainLength++;
                currEnd = pairs[i][1];
            }
        }

        return chainLength;
    }

    public static void main(String[] args) {

        int[][] pairs = {
                {1,2},
                {2,3},
                {3,4}
        };

        System.out.println("Pairs:");
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
        System.out.println("Maximum Chain Length: " + findLongestChain(pairs));
    }
}