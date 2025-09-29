/*package Array;
import java.util.Scanner;
public class  MaxMinIndex{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        int i;
        System.out.print("Enter the array elements: ");
        for (i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int maxIndex = 0;
        int min = arr[0];
        int minIndex = 0;
        for (i=0;i<n;i++){
            if (max<arr[i]){
                max = arr[i];
                maxIndex = i;
            }
            if(min>arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("Max-Index: "+maxIndex);
        System.out.println("Min-Index: "+minIndex);

    }
}*/

package Array;
import java.util.Scanner;
public class MaxMinIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        int i;
        System.out.print("Enter the array elements: ");
        for (i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (i=0;i<n;i++){
            if (max<arr[i]){
                max = arr[i];
                maxIndex = i;
            }
            if(min>arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("Max-Index: "+maxIndex);
        System.out.println("Min-Index: "+minIndex);

    }
}


