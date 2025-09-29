package Array;
import java.util.Scanner;
public class maxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i=0;i<n;i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Greatest element: " + max);
    }
}

//max = Math.max(max,arr[i]); this can also be used.


// Integer.MIN_VALUE gives smallest integer value so can store this value in max instead of first element of the array.