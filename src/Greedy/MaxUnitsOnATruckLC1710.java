package Greedy;
import java.util.*;
public class MaxUnitsOnATruckLC1710 {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int ans = 0;

        for (int[] box : boxTypes) {
            int boxes = box[0];
            int units = box[1];

            int take = Math.min(boxes, truckSize);

            ans += take * units;
            truckSize -= take;

            if (truckSize == 0) {
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] boxTypes = {
                {1, 3},
                {2, 2},
                {3, 1}
        };

        int truckSize = 4;

        System.out.println(maximumUnits(boxTypes, truckSize));
    }
}