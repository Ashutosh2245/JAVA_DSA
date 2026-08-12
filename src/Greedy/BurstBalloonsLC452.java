package Greedy;
import java.util.*;
public class BurstBalloonsLC452 {

    public static int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;

        Arrays.sort(points, (a, b) -> Long.compare(a[1], b[1]));

        int arrows = 1;
        long arrowPos = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > arrowPos) {
                arrows++;
                arrowPos = points[i][1];
            }
        }

        return arrows;
    }

    public static void main(String[] args) {

        int[][] balloons = {
                {10,16},
                {2,8},
                {1,6},
                {7,12}
        };

        System.out.println("Balloons:");
        for (int[] balloon : balloons) {
            System.out.println(Arrays.toString(balloon));
        }

        System.out.println("Minimum Arrows Needed: " + findMinArrowShots(balloons));
    }
}