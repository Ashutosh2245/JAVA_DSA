package conditionals;
import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("Number is Even.");
        }
        else{
            System.out.println("Number is Odd.");
        }
    }
}
