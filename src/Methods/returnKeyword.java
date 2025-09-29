package Methods;
public class returnKeyword {
    public static void greet(int time){
        if (time<0) return; // If time is negative then function won't return anything.
        System.out.println("Good morning!");
    }

    public static void main(String[] args) {
        greet(-5);
        greet(0);
        greet(10);
    }
}
