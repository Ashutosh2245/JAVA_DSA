package Array;
import java.util.*;
public class AddOrDeleteElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initial input
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println("Initial Array: " + arr);

        // Add element
        System.out.print("Enter element to add: ");
        int addElement = sc.nextInt();
        arr.add(addElement);
        System.out.println("After Adding: " + arr);

        // Delete element
        System.out.print("Enter element to delete: ");
        int delElement = sc.nextInt();
        if (arr.contains(delElement)) {
            arr.remove(Integer.valueOf(delElement)); // remove by value
            System.out.println("After Deleting: " + arr);
        } else {
            System.out.println("Element not found!");
        }
    }
}
