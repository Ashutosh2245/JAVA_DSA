package Searching.BinarySearch;
public class UpperLowerBound {
    // Lower Bound function → first index where arr[i] >= target
    public static int lowerBound(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int lower = n;  // default (not found case)
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                lower = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return lower;
    }
    // Upper Bound function → first index where arr[i] > target
    public static int upperBound(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int upper = n;  // default (not found case)
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                upper = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return upper;
    }
    public static void main(String[] args) {
        int[] arr = {10, 23, 46, 46, 91, 97, 140, 264};
        int target = 46;
        int lb = lowerBound(arr, target);
        int ub = upperBound(arr, target);
        System.out.println("Target = " + target);
        System.out.println("Lower Bound index = " + lb + (lb < arr.length ? " (value = " + arr[lb] + ")" : " (not found)"));
        System.out.println("Upper Bound index = " + ub + (ub < arr.length ? " (value = " + arr[ub] + ")" : " (not found)"));
    }
}

