package Methods;
public class moreFunctions {
    public static void fun1(){
        fun2();
        for(int i =1;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        fun3();
    }
    public static void main(String[] args){
        System.out.println("Good Morning!");
        fun1();
        System.out.println("How are you?");
        fun2();
        System.out.println("What's going on?");
        fun3();
    }
    public static void fun2(){
        System.out.println("Hey dude!");
    }
    public static void fun3(){
        System.out.println("Take care!");
    }
}
