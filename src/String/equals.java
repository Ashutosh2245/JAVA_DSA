package String;
public class equals {
    public static void main(String[] args) {
        String s = "abcxyz";
        String t = "abcxyz";
        System.out.println(s==t); //true
        String a = "abcxyz";
        String b = "abc";
        b = b+"xyz";
        String c = new String(a);
        System.out.println(a==b); //false
        System.out.println(a==c);//false
        System.out.println(a.equals(b)); //true
        System.out.println(a.equals(c)); //true
    }
}
// == operator compares memory location or address.
// equals() compares each character one by one