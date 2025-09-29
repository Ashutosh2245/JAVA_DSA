/*package Arrays;

public class outputOfArray {
    public static void main(String[] args) {
        int[] arr = new int[7];
        // Size of array = 7.
        arr[0] = 10; // First element
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
        arr[6] = 70; // Seventh element.

        // Output -> Loop
        for (int i =0;i<=6;i++){
            System.out.print(arr[i] + " ");
        }
    }

}*/

// Taking input from user.
package Array;
import java.util.Scanner;
public class outputOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[7];
        // input -> Loop
        System.out.println("Enter the array elements: ");
        for (int i = 0; i <= n-1; i++){
            arr[i] = sc.nextInt();
        }
        // output -> loop
        System.out.println("Array elements are: ");
        for (int i = 0;i<=n-1;i++){
            System.out.print(arr[i] + " ");
        }
    }
}