package Methods;

public class returnType {
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        int x = sum(3,4);
        System.out.println("Sum: "+x);
       // System.out.println("Sum: "+(sum(3,4)));
    }
}



///  DIFFERENCE BETWEEN RETURN AND METHOD CALLING
// Return Type
/*
package Methods;
public class returnType{
    public static int sum(int a,int b){
        System.out.println("Hello!");
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(5,8));
    }
}*/



// Method calling
/*
package Methods;
public class returnType{
    public static void sum(int a,int b){
        System.out.println("Hello!");
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        sum(9,9);
    }
}
*/
