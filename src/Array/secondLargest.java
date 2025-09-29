//package Array;
//import java.util.Scanner;
//public class secondLargest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the array size: ");
//        int n =  sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter the array elements: ");
//        for (int i = 0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for (int i=0;i<n;i++){
//            if (max<arr[i]){
//                max = arr[i];
//            }
//        }
//        int second_max = Integer.MIN_VALUE;
//        for (int i =0;i<n;i++){
//            if (arr[i]>second_max && arr[i]!=max){
//                second_max = arr[i];
//            }
//        }
//        System.out.println("Greatest element: " + max);
//        if (second_max == Integer.MIN_VALUE) {
//            System.out.println("No distinct second greatest element found.");
//        } else {
//            System.out.println("Second greatest element: " + second_max);
//        }
//    }
//}
//
////max = Math.max(max,arr[i]); this can also be used.
//
package Array;
import java.util.Scanner;
public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        secondLargest obj = new secondLargest();
        System.out.println(obj.maximum(arr));
    }
    public static int maximum(int[] arr){
        int max = arr[0];
        for (int i=0;i< arr.length;i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}

//max = Math.max(max,arr[i]); this can also be used.

