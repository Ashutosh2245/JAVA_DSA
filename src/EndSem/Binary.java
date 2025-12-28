package EndSem;
import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        int low = 0, high = n-1;
        boolean flag = false;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>target) high--;
            else if (arr[mid]<target) low++;
            else{
                flag = true;
                break;
            }
        }
        if (flag) System.out.println("Found");
        else System.out.println("Not Found!");
    }
}
