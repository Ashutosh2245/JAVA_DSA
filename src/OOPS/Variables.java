//Calling a static method

/*
package OOPS;
public class Variables {
    static void staticMethod(){
        System.out.println("Static method called");
    }

    public static void main(String[] args) {
        //Calling static method using class name
        Variables.staticMethod();
       // Calling static method directly (since inside same class)
        staticMethod();
    }
}
*/


//Calling a non-static (instance) method
/*package OOPS;
public class Variables {
    void nonStaticMethod(){
        System.out.println("Non-Static method called");
    }

    public static void main(String[] args) {
        Variables obj = new Variables(); //Creating an object
        obj.nonStaticMethod(); // calling instance method via object
    }
}*/

// Calling non-static method from static method
/*package OOPS;
public class Variables {
    void display(){
        System.out.println("Non-Static method display");
    }

    public static void main(String[] args) {
        Variables a = new Variables(); //Creating an object
        a.display(); // calling instance method via object
    }
}*/

//Calling static method from non-static method
/*package OOPS;
public class Variables {
    static void staticMethod(){
        System.out.println("Static method called");
    }
    void nonStaticMethod(){
        staticMethod(); //direct call
        Variables.staticMethod(); // call using class name
    }

    public static void main(String[] args) {
        Variables obj = new Variables();
        obj.nonStaticMethod(); //calling non-static method
    }
}*/

//Calling a non-static method using another non-static method
package OOPS;
public class Variables {
    void firstNonStaticMethod(){
        System.out.println("Non-Static method called");
    }
    void secondNonStaticMethod(){
        firstNonStaticMethod(); //direct call
    }

    public static void main(String[] args) {
        Variables a = new Variables();
        a.secondNonStaticMethod(); //Calling the second method, which calls first.
    }
}