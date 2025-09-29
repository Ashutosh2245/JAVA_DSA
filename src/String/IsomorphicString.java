package String;
import java.util.Scanner;
class IsomorphicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] mapST = new int[256]; // s -> t mapping
        int[] mapTS = new int[256]; // t -> s mapping

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // agar mapping pehle se hai, check karo
            if (mapST[c1] == 0 && mapTS[c2] == 0) {
                mapST[c1] = c2;
                mapTS[c2] = c1;
            } else {
                // mapping conflict mila
                if (mapST[c1] != c2 || mapTS[c2] != c1) {
                    return false;
                }
            }
        }
        return true;
    }
}
