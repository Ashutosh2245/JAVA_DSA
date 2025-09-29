package conditionals;
import java.util.Scanner;
public class greatestNumber {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        System.out.print("Enter the third number: ");
        c = sc.nextInt();
        if (a>b && a>c){
            System.out.println(a +" is greatest.");
        }
        else if (b>a && b>c){
            System.out.println(b +" is greatest.");
        }
        else{
            System.out.println(c +" is greatest.");
        }
    }
}
