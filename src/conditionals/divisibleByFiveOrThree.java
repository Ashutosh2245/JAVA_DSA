package conditionals;
import java.util.Scanner;
public class divisibleByFiveOrThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        if (n%5 == 0 || n%3 == 0){
            System.out.println("Divisible by 5 or 3.");
        }
        else{
            System.out.println("Not divisible by 5 or 3.");
        }
    }
}
//If number is divisible 15 then it will be divisible by both 5 and 3.