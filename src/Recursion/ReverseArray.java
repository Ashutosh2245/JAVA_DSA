package Recursion;
import java.util.Arrays;
public class ReverseArray {
    public static void reverse(int[] arr, int left, int right) {
        if (left >= right) return;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverse(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}

