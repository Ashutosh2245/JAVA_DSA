package Array;
public class initialiseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        // Accessing any particular element.
        // System.out.println(arr[2]);

        // Printing whole array.
        System.out.print("Array: ");
        for (int i =0;i<7;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nLength of array: "+arr.length);
    }
}
