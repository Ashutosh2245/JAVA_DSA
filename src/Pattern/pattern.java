package Pattern;
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        int n;
        int num = 1 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows or columns: ");
        n = sc.nextInt();


        for(int i=0;i<n;i++){ //rows
            for(int j=0;j<n;j++){ //columns
                System.out.print(num+ " ");
                num ++;
            }
            System.out.println();
        }
    }
}