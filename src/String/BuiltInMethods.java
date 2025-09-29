package String;
public class BuiltInMethods {
    public static void main(String[] args) {
        String s1 = "Ashutosh";
        String s2 = "Kumar";
        String s3 = "Kamal";
        String s4 = "Kumaraa";
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s1.charAt(6));
        System.out.println(s2.indexOf("R"));
        System.out.println(s1.indexOf("h"));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s4.compareTo(s2));
        System.out.println(s2.compareTo(s4));
        System.out.println(s2.compareTo(s3));

        System.out.println(s1.contains("As"));
        System.out.println(s2.contains("As"));
        System.out.println(s1.startsWith("Ash"));
    }
}
