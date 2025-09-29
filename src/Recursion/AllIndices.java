package Recursion;
public class AllIndices {
    public static void findIndices(int[] arr, int idx, int target) {
        if (idx == arr.length) return;
        if (arr[idx] == target) {
            System.out.print(idx + " ");
        }
        findIndices(arr, idx + 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2};
        int target = 2;
        findIndices(arr, 0, target);
    }
}

