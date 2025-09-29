//
//Enter n: 5
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

package Pattern;
import java.util.Scanner;
public class floydTriangle{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();

        int a = 1;
        for (int i =1;i<=n;i++){
            for (int j=1; j<=i;j++){
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}