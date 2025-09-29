package conditionals;
import java.util.Scanner;
public class profitLoss {
    public static void main(String[] args) {
        int cp,sp,profit,loss;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price in Rs.: ");
        cp = sc.nextInt();
        System.out.print("Enter the selling price in Rs.: ");
        sp = sc.nextInt();
        if (sp>cp){
            profit = sp-cp;
            System.out.println("Profit will be : Rs." + profit);
        }
        else if(cp == sp){
            System.out.println("No profit and no loss.");
        }
        else{
            loss = cp-sp;
            System.out.println("Loss will be: Rs." + loss);
        }
    }
}
