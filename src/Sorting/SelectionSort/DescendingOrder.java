/*package Sorting.SelectionSort;
import java.util.Arrays;
public class DescendingOrder {
    public static void main(String[] args) {
        int[] arr = {3,4,1,5,2};
        DescendingOrder obj = new DescendingOrder();
        int[] sortedArr = obj.sorting(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
    public int[] sorting(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }
}
*/

// Method 2 --> using bubble sort
package Sorting.SelectionSort;
import java.util.Arrays;
public class DescendingOrder {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 5, 2};

        DescendingOrder obj = new DescendingOrder();
        int[] sortedArr = obj.sorting(arr);

        System.out.println(Arrays.toString(sortedArr));
    }

    public int[] sorting(int[] arr) {
        int n = arr.length;

        // Bubble Sort in descending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { // swap if smaller (for descending)
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
