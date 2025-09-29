package String;
public class PassingStringsToFun {
    public static void main(String[] args) {
        String s = "Ashutosh";
        System.out.println(s);
        change(s);
        System.out.println(s);
    }
    public static void change(String s){
        s = "Madhav";
    }

}
