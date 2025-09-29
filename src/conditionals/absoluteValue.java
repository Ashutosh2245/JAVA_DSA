package conditionals;
import java.util.Scanner;
public class absoluteValue {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        if (n>=0){
            System.out.println("Absolute Value is: " + n);
        }
        else{
            System.out.println("Absolute Value is: " + (n*-1));
        }
    }
}
