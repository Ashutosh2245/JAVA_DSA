package Basics;
import java.util.Scanner;
public class squareNumber {
    public static void main(String[] args) {
        int n,sq;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        sq = n*n;
        System.out.println("Square of the number: " + sq);
    }
}
