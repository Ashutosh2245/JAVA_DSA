package Searching.LinearSearch;
public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // return index if found
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 15, 50};
        int key = 15;

        int result = linearSearch(arr, key);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
