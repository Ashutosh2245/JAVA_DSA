package Queue;
import java.util.*;
public class Dota2SenateLC649 {
    public static String predictPartyVictory(String senate) {
        Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();

        int n = senate.length();
        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='R'){
                r.add(i);
            }
            else d.add(i);
        }
        while(!r.isEmpty() && !d.isEmpty()){
            if(r.peek()<d.peek()){
                r.add(n++);
            }
            else{
                d.add(n++);
            }
            r.remove();
            d.remove();
        }
        return r.isEmpty() ? "Dire" : "Radiant";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        String winner = predictPartyVictory(s);
        System.out.println("Winner is: "+winner);
    }
}