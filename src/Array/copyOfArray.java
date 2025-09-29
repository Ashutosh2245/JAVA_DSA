package Array;
import java.util.Arrays;
public class copyOfArray {
    public static void main(String[] args) {
        int[] arr  = {10,30,22,45,21,34,19,8,99};
        System.out.print("Array:  ");


        // for-each loop.
//        for(int ele:arr){
//            System.out.print(ele+" ");

        //for loop
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //Shallow copy concept
        /*System.out.println();
        int[] num = arr; // It'll make a shallow copy.
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        num[0] = 70;
        System.out.println(num[0]);
        System.out.println(arr[0]);*/

        // Deep copy concept.
        System.out.print("\nCopied Array: ");
        int[] brr = Arrays.copyOf(arr,arr.length);
        for (int ele: brr){
            System.out.print(ele+" ");
        }
        brr[0] = 70;
        System.out.println("\n"+arr[0]);
        System.out.println(brr[0]);
    }
}

//Shallow copy is just like pass by reference that means here,
// we assigned a new name "num" to the array "arr" and,
// if we make any change in "num" array then it'll be also displayed in "arr" array.

//Deep copy only copies an array and even if we change in new array then it won't affect the original array.

// Alternate method for deep copy.

// int[] crr = new int[arr.length];
// for(int i = 0;i<arr.length;i++){
//      crr[i] = arr[i]
// }