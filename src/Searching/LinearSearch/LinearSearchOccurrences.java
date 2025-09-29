package Searching.LinearSearch;
public class LinearSearchOccurrences {
    public static void linearSearch(int[] arr, int key) {
        boolean found = false;
        System.out.print("Key found at indices: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Key not found.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 3, 9, 3};
        int key = 3;

        linearSearch(arr, key);
    }
}
