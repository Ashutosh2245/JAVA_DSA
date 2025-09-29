package conditionals;
import java.util.*;
public class AutoRent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance: ");
        int dist = sc.nextInt();
        int fare  =20; //fixed

        if(dist>0 && dist<=10){
            fare = fare+dist*5;
        }
        else if(dist>10 && dist<=50){
            fare = fare+10*5+(dist-10)*7;
        }
        else{
            fare = fare+10*5+40*7+(dist-50)*11;
        }
        System.out.print("total fare: "+fare);
    }
}
