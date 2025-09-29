// USING FOR LOOP

/*package Array;
import java.util.Scanner;
public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("\nReversed Array: ");
        for(int i =0;i<n/2;i++){
            int j = n-1-i; //i+j=n-1
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}*/


// USING TWO POINTERS

//package Array;
//import java.util.Scanner;
//public class reverseArray {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the array size: ");
//        int n =  sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter the array elements: ");
//        for (int i = 0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("\nReversed Array: ");
//        //Reverse
//        int i =0, j = n-1;
//        while(i<=j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j]= temp;
//            i++;
//            j--;
//        }
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//    }
//}

// METHOD 3

package Array;
import java.util.Scanner;
public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("\nReversed Array: ");
        //Reverse
        int i =0, j = n-1;
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

//for swapping a part of array -
//we can set value of indices (i and j) manually, it'll reverse the elements of that particular range.