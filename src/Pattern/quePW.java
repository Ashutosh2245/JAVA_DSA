package Pattern;
import java.util.Scanner;

public class quePW {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {      // rows
            for (int j = 1; j <= n; j++) {  // columns
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}

//METHOD 2//

//package Pattern;
//import java.util.Scanner;
//public class quePW {
//
//    public static void printPattern(int n) {
//        for (int i = 0; i < n; i++) {              // rows
//            for (int j = 0; j < n; j++) {         // columns
//                System.out.print(n);
//            }
//            System.out.println();                // move to next line
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();  // read input from user
//        printPattern(input);
//    }
//}


