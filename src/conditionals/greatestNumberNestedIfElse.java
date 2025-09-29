package conditionals;
import java.util.Scanner;
public class greatestNumberNestedIfElse {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        System.out.print("Enter the third number: ");
        c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a+ " is greatest.");
            }
            else{ //c>a>b
                System.out.println(c+ " is greatest.");
            }
        }
        else{ //b>a
            if(b>c){
                System.out.println(b+ " is greatest.");
            }
            else{ //c>b>a
                System.out.println(c+ " is greatest.");
            }
        }
    }
}