package Searching.BinarySearch;
public class BasicBinarySearch{
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;  // avoids overflow
            if (arr[mid] == key) {
                return mid; // found
            } else if (arr[mid] < key) {
                left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }
        return -1; // not found
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int key = 7;

        int result = binarySearch(arr, key);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
