package Searching.BinarySearch;
public class LC2062Method2 {
    public static boolean isPossible(int[] arr, int n, int maxQuant) {
        int stores = 0;
        for (int num : arr) {
            // Ceiling division
            stores += (num + maxQuant - 1) / maxQuant;
        }
        return stores <= n;
    }
    public static int minimize(int[] arr, int n) {
        int mx = Integer.MIN_VALUE;
        for (int x : arr) mx = Math.max(mx, x);
        int low = 1, high = mx; // low = 1 to avoid division by zero
        int ans = mx;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, n, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {15, 10, 10};
        int n = 5; // Number of stores
        int answer = minimize(arr, n);
        System.out.println(answer); // Output: 5
    }
}
