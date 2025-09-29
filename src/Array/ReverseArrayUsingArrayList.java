package Array;
import java.util.*;
public class ReverseArrayUsingArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("Reversed Array: ");
        for (int i = n-1; i >=0; i--) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        sc.close();
    }
}
