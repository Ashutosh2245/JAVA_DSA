package String;
public class modifyCharacter {
    public static void main(String[] args) {
        String s = "hello";
        // hello - heylo
        s = s.substring(0,2)+"y"+s.substring(3);
        System.out.println(s);
    }
}
// This method is applicable, but it will take a lot of time and space.
// Therefore, String is immutable