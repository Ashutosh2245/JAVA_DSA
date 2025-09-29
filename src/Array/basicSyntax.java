package Array;

public class basicSyntax {
    public static void main(String[] args) {
        int [] arr; // Declaration
        arr = new int[5]; // Memory Allocation
        // int[] arr = new int[5]; // It is also correct.
        // Size of array = 5.
        // Initialising individual elements.
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        // Output of array elements.
        System.out.println(arr[0]);
        // Updating value
        arr[0] = 99;
        arr[0] += 100;
        System.out.println(arr[0]);


    }
}
