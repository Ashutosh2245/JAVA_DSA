package Recursion;
import java.util.*;
public class Subsets {
    public static void generateSubsets(int[] arr, int idx, List<Integer> current) {
        if (idx == arr.length) {
            System.out.println(current);
            return;
        }
        current.add(arr[idx]);
        generateSubsets(arr, idx + 1, current);
        current.removeLast();
        generateSubsets(arr, idx + 1, current);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        generateSubsets(arr, 0, new ArrayList<>());
    }
}

