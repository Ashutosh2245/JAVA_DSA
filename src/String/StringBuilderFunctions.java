package String;
public class StringBuilderFunctions {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ashutosh");
        StringBuilder tb = new StringBuilder("Tiwari");
        System.out.println(sb.compareTo(tb));
        // System.out.println(sb.toLowercase()); not valid for stringBuilders
        System.out.println(sb.indexOf("A"));
        System.out.println(sb.reverse());
// toLowercase and toUppercase will not run.


    }
}
