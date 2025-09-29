package String;
public class StringBuilderInJava {
    public static void main(String[] args) {
        String s = "";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        StringBuilder x = new StringBuilder("Ashutosh");
        System.out.println(x.length());
        System.out.println(x.capacity());

        StringBuilder y = new StringBuilder(10);
        System.out.println(y.length());
        System.out.println(y.capacity());
    }
}
