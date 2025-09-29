package conditionals;
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 400 == 0){
            System.out.print("Leap year");
        }
        else if( year %4 == 0 && year % 100!= 0){
            System.out.print("Leap Year");
        }
        else{
            System.out.print("Not a leap year.");
        }
    }
}
