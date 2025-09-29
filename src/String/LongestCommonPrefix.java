package String;
import java.util.Scanner;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String [] str = new String[n];
        for(int i=0;i<n;i++){
            str[i] = sc.nextLine();
        }

        String ans = longest(str);
        System.out.println(ans);
    }

    public static String longest(String[] arr){
        if(arr == null || arr.length==0) return "";

        String ref = arr[0];
        for (int i = 0; i < ref.length(); i++) {
            char currentChar = ref.charAt(i);

            for(int j=1;j<arr.length;j++){
                if(i>=arr[j].length() ||arr[j].charAt(i)!=currentChar){
                    return ref.substring(0,i);
                }
            }

        }
        return ref;
    }
}
