package Greedy;
import java.util.*;
public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};
        int n = start.length;

        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;
        //Arrays.sort(idx, (a, b) -> finish[a] - finish[b]);
        Arrays.sort(idx, Comparator.comparingInt(i -> finish[i]));


        System.out.println("Selected activities:");
        int lastFinish = finish[idx[0]];
        System.out.print("(" + start[idx[0]] + "," + finish[idx[0]] + ") ");

        for (int i = 1; i < n; i++) {
            if (start[idx[i]] >= lastFinish) {
                System.out.print("(" + start[idx[i]] + "," + finish[idx[i]] + ") ");
                lastFinish = finish[idx[i]];
            }
        }
    }
}

