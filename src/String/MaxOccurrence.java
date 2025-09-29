package String;
import java.util.Scanner;
public class MaxOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int [] frequencyArr = new int[26];
        // 0 -> a, 1 -> b, 2 -> c, 3-> d, ...... , 25 -> z
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
//            int index = (int) ch - 97;
//            frequencyArr[index]++;
            if (ch >= 'a' && ch <= 'z') {
                frequencyArr[ch - 'a']++;
            }
        }
        int maxFreq = -1;
        for (int i = 0; i < frequencyArr.length; i++) {
            maxFreq = Math.max(maxFreq, frequencyArr[i]);

        } for (int i = 0; i < frequencyArr.length; i++) {
            if(frequencyArr[i]==maxFreq){
                char ch = (char)(i+97);
                System.out.println(ch+" ");
            }

        }

    }
}
