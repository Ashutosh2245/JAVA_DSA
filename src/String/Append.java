package String;
public class Append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Abc");
        System.out.println(sb);
        sb.append(35);
        System.out.println(sb);
        sb.append('*');
        System.out.println(sb);
        sb.append("xyz");
        System.out.println(sb);
        char [] ch = {'A','s','h','u'};
        sb.append(ch);
        System.out.println(sb);
        int [] arr = {1,2,3};
        // sb.append(arr); // Does not work, address is appended.
        // System.out.println(sb);

        StringBuilder tb = new StringBuilder("abc");
        sb.append(tb);
        System.out.println(sb);

    }
}
// append is not supported in string.