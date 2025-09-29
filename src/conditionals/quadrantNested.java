package conditionals;
import java.util.Scanner;
public class quadrantNested {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        y = sc.nextInt();

        if (x>0){
            if(y>0) System.out.println("1st Quadrant");
            else if (y<0) System.out.println("4th Quadrant");
            else System.out.println("X Axis");
        }
        else if (x==0){
            if (y==0) System.out.println("Origin Point");
            else System.out.println("Y Axis");
        }
        else{
            if(y>0) System.out.println("2nd Quadrant");
            else if (y<0) System.out.println("3rd Quadrant");
            else System.out.println("X Axis");
        }
    }
}

