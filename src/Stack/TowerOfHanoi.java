package Stack;
import java.util.Scanner;
public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of disks: ");
        int n = sc.nextInt();
        solve(n,'A','B','C');

    }
    public static void solve(int n, char from, char aux, char to){
        if(n==1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        solve(n-1,from,aux,to);
        System.out.println("Move disk "+ n+" from " + from + " to " + to);
        solve(n-1,aux,to,from);
    }
}
