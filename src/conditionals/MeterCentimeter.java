package conditionals;
import java.util.*;
public class MeterCentimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter cm1: ");
        int cm1 = sc.nextInt();
        System.out.print("Enter m2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter cm2: ");
        int cm2 = sc.nextInt();

        int cm3 = cm1+cm2;
        int m3;
        if(cm3>=100){
            m3 = m1+m2+1;
            cm3 = cm3%100;
        }
        else{
            m3 = m1+m2;
        }
        System.out.print("Length: "+m3+" meter "+cm3+" cm.");
    }
}
