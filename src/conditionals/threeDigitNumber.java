package conditionals;
import java.util.Scanner;
public class threeDigitNumber {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        n = sc.nextInt();
        if (n>99 && n<1000){
            System.out.println("Yes,Number contains three digits.");
        }
        else{
            System.out.println("No,Number doesn't contain 3 digits.");
        }
    }
}
