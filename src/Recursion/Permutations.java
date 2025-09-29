package Recursion;
import java.util.*;
public class Permutations {
    public static void permute(int[] arr, boolean[] used, List<Integer> current) {
        if (current.size() == arr.length) {
            System.out.println(current);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current.add(arr[i]);
                permute(arr, used, current);
                current.removeLast();
                used[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        permute(arr, new boolean[arr.length], new ArrayList<>());
    }
}




