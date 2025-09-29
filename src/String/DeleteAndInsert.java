package String;
public class DeleteAndInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb); // abcef
        sb.append("xyz");
        System.out.println(sb); // abcefxyz
        sb.delete(2,6); // deletes characters from 2 to 5.
        System.out.println(sb); //abyz
        sb.setCharAt(2,'g');
        System.out.println(sb); // abgz

        sb.insert(2,'y');
        System.out.println(sb); //abygz

        sb.insert(2,"Hi");
        System.out.println(sb);

        sb.insert(2,56);
        System.out.println(sb);

        sb.insert(2,true);
        System.out.println(sb);
    }

}
