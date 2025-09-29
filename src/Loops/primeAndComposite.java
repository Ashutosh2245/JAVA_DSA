// PRIME AND COMPOSITE NUMBER CHECKER //

// METHOD 1

//package Loops;
//import java.util.Scanner;
//public class primeAndComposite {
//    public static void main(String[] args) {
//        Scanner sc =  new Scanner (System.in);
//        int n;
//        System.out.print("Enter the number: ");
//        n = sc.nextInt();
//
//        int x = 0; //0 means prime.
//        for (int i = 2;i<=n-1;i++){
//            if(n%i==0) { // 'i' is a factor of n.
//                System.out.println(n + " is a Composite Number.");
//                x = 1; // 1 means composite.
//                break;
//
//            }
//        }
//        if (n==1) System.out.println(n+" is neither Prime nor Composite.");
//        else if (x==0) System.out.println(n+ " is a Prime Number.");
//    }
//}

// METHOD 2
package Loops;
import java.util.Scanner;
public class primeAndComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        if (n == 1) {
            System.out.println(n + " is neither Prime nor Composite.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= n-1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

//            if (isPrime) {
//                System.out.println(n + " is a Prime Number.");
//            } else {
//                System.out.println(n + " is a Composite Number.");
//            }
//        }
        if (!isPrime) {
            System.out.println(n + " is a Composite Number.");
        } else {
            System.out.println(n + " is a Prime Number.");
        }
    }
        sc.close();
    }
}
// isPrime means isPrime == true
// !isPrime means isvPrime == false