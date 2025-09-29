package String;
public class DeleteAllSpaces {
    public static void main(String[] args) {
        String str = "Ashutosh     Kumar";
        System.out.println(str.replaceAll("\\s+", ""));
        System.out.println(str.replaceAll("\\s+", " "));


    }
}
