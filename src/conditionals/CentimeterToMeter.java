package conditionals;
import java.util.Scanner;
public class CentimeterToMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dist = sc.nextInt();
        int m=0, cm=0;
        if(dist>100){
            m = dist/100;
            cm = dist%100;
        }
        else if (dist>0){
            cm = dist%100;
        }
        else{
            System.out.print("Enter valid input");
        }
        System.out.print("Distance: "+m+"m & "+cm+" cm");
    }
}
