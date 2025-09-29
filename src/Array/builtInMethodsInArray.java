package Array;
import java.util.Arrays;
public class builtInMethodsInArray {
    public static void main(String[] args) {
        int[] arr = {30,10,40,23,89,34};
        System.out.print("Array:  ");
        //for-each loop
        for (int ele:arr){
            System.out.print(ele+" ");
        }
//        for (int i =0;i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
        Arrays.sort(arr);
        System.out.print("\nSorted array:  ");
        for (int i =0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//for (int i =0;i<arr.length;i++){
//    System.out.print(arr[i] + " ");
//}

//We can use for-each loop instead of above for loop.

//for (int ele: arr){
//    System.out.print(ele+" ");
//}