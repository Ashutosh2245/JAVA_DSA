package Searching.LinearSearch;
public class LinearSearchString {
    public static int linearSearch(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] names = {"Ashutosh", "Rahul", "Priya", "Neha"};
        String key = "Priya";

        int result = linearSearch(names, key);

        if (result == -1) {
            System.out.println("Name not found.");
        } else {
            System.out.println("Name found at index: " + result);
        }
    }
}
