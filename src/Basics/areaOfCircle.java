package Basics;
import java.util.Scanner;
public class areaOfCircle {
    public static void main(String[] args) {
        double radius,area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of Circle: ");
        radius = input.nextDouble();
        area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

}
