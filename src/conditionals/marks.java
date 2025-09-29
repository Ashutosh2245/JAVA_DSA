package conditionals;
import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        marks = sc.nextInt();

        if (marks>=81){
            System.out.println("Grade A");
        }
        else if (marks>=61){
            System.out.println("Grade B");
        }
        else if (marks>=41){
            System.out.println("Grade C");
        }
        else {
            System.out.println("FAIL");
        }
    }
}
