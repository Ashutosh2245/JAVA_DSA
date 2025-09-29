// Rotate the given array 'a' by k steps without using extra array, where k is non-negative.

// arr = [10,20,30,40,50,60,70]
// if k = 5; Rotated Array = [30,40,50,60,70,10,20]

package Array;
import java.util.Scanner;
public class rotatingArray {
    public static void reverse(int[] arr, int i, int j) {
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n; // Handle rotation more than size
        reverse(arr, 0, n - k - 1); // Reverse first part
        reverse(arr, n - k, n - 1); // Reverse second part
        reverse(arr, 0, n - 1); // Reverse whole array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of rotations: ");
        int k = sc.nextInt();

        rotate(arr, k);

        System.out.print("Rotated Array: ");  
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
