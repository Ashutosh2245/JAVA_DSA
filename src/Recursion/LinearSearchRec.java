package Recursion;
public class LinearSearchRec {
    public static boolean search(int[] arr, int idx, int target) {
        if (idx == arr.length) return false;
        if (arr[idx] == target) return true;
        return search(arr, idx + 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9, 11};
        int target = 7;
        System.out.println(search(arr, 0, target));
    }
}

