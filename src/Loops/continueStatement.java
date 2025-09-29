package Loops;
import java.util.Scanner;
public class continueStatement {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        for(int i =1;i<=n;i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i+" ");
        }
    }
}
// Continue statement skips the value where continue is used and after that loops is again started.
// In the above code loop will stop whenever i%2==0 and after skipping that value of i the loop will again execute,