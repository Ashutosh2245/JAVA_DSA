import java.util.*;
public class Vehicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("No of tyres: ");
        int t = sc.nextInt();
        System.out.print("No of vehicles: ");
        int v = sc.nextInt();

        if(t > v*4 || t < v*2 || t%2 == 1) {
            System.out.println("Wrong Input!!");
            return;
        }

        int bikes = (4*v - t) / 2;
        int cars = v - bikes;

        System.out.println("Cars: " + cars);
        System.out.println("Bikes: " + bikes);
    }
}