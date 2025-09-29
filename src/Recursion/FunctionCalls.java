package Recursion;
public class FunctionCalls {
    public static void apple (){
        System.out.println("Hi, I'm in apple method.");
    }
    public static void main(String[] args) {
        System.out.println("Hi, I'm in main method.");
        apple();
    }
}
