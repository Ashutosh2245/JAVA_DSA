package conditionals;
import java.util.Scanner;
public class quadrant {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x coordinate: ");
        x = sc.nextInt();
        System.out.println("Enter y coordinate: ");
        y = sc.nextInt();

        if(x==0 && y==0) {
            System.out.println("Origin Point");
        }
        else if (x>0 && y>0){
            System.out.println("1st Quadrant");
        }
        else if (x>0 && y<0){
            System.out.println("4th Quadrant");
        }
        else if (x<0 && y>0){
            System.out.println("2nd Quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("3rd Quadrant");
        }
        else if(x==0){
            System.out.println("Y Axis");
        }
        else if(y==0){
            System.out.println("X Axis");
        }
        else {
            System.out.println("Please Enter Valid Inputs");
        }
    }
}
