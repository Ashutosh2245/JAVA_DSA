// Create a calculator using switch case that takes two numbers and an
// operator from user as input.

// USING IF ELSE
/*
package conditionals;
import java.util.Scanner;
public class switchStatement {
    public static void main(String[] args) {
        int a,b ;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        System.out.print("Enter Operator: ");
        op = sc.next().charAt(0);
        if(op == '+') System.out.println("Output: "+(a+b));
        if(op == '-') System.out.println("Output: "+(a-b));
        if(op == '*') System.out.println("Output: "+(a*b));
        if(op == '/') System.out.println("Output: "+(a/b));
    }
}
*/

// USING TERNARY OPERATOR.
package conditionals;
import java.util.Scanner;
public class switchStatement {
    public static void main(String[] args) {
        int a,b ;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        System.out.print("Enter Operator: ");
        op = sc.next().charAt(0);
        switch(op){
            case '+':
                System.out.println("Output: "+(a+b));
                break;
            case '-':
                System.out.println("Output: "+(a-b));
                break;
            case '*':
                System.out.println("Output: "+(a*b));
                break;
            case '/':
                System.out.println("Output: "+(a/b));
                break;
        }
    }
}
