package Greedy;
import java.util.*;
public class NonOverlappingIntervalsLC435 {
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int removed = 0;
        int currEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < currEnd) {
                removed++;
            } else {
                currEnd = intervals[i][1];
            }
        }

        return removed;
    }

    public static void main(String[] args) {

        int[][] intervals = {
                {1, 2},
                {2, 3},
                {3, 4},
                {1, 3}
        };

        System.out.println("Intervals:");
        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }
        System.out.println("Minimum Intervals to Remove: " + eraseOverlapIntervals(intervals));
    }
}
