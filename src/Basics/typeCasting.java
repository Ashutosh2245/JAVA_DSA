package Basics;
import java.util.Scanner;
public class typeCasting {
    public static void main(String[] args) {
        int x;
        double z;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        double y = (double) x;
        System.out.println(y/2);

        z = sc.nextInt();
        int w = (int) z;
        System.out.println(w/2);
    }
}
