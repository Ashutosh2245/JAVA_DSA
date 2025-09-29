package Methods;

public class arguments {
    public static void greet(String name){
        System.out.println("Good morning " + name );
    }
    public static void sum(int a, int b){
        System.out.println("Sum: "+(a+b));
    }
    public static void main(String[] args) {
        greet("Bro");
        greet("Ashutosh");
        sum(10,20);
        intro("Ashutosh",20);
    }
    public static void intro(String name, int age){
        System.out.println("Hello " + name +"! " + "your age is "+age);
    }
}
