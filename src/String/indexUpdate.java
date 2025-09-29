//Update even indices with 'a'.
package String;
public class indexUpdate {
    public static void main(String[] args) {
        String s = "Ashutosh";
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if(i%2==0) str += 'a';
            else str += s.charAt(i);
        }
        System.out.println(str);
    }
}
