package Array;
import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target element: ");
        int x = sc.nextInt();
        System.out.print("Enter the array size: ");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = false;  // false means not found.
        for (int i = 0;i<n;i++){
            if (arr[i] == x){
               flag = true; // true means found.
                break;
            }
        }
        if (flag)  System.out.println("Element found.");
        else System.out.println("Element not found.");
    }
}

// flag means flag == true.


// METHOD 2
//        if (!flag)  System.out.println("Element not found.");
//        else System.out.println("Element found.");
// !flag means flag == false.