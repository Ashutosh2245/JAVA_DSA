package Array;
import java.util.Scanner;
public class rollNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the marks of students: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Roll no. of failed students: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] < 35) {
                System.out.print((i+1) + " ");
            }
        }
    }
}


/*package Arrays;
public class rollNumber {
    public static void main(String[] args) {
        int[] arr = {81,45,67,100,12,34,56,24};
        int n = arr.length;
        System.out.println("Roll no. of passed students: ");
        for (int i = 0; i < n;i++){
            if(arr[i]<35){
                System.out.print(i+" ");
            }
        }
    }
}*/
