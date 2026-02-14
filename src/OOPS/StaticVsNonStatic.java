package OOPS;
public class StaticVsNonStatic {

    // 🔵 Instance variable (har object ka alag hoga)
    int[] arr = {10, 20, 30, 40, 50};

    // 🔵 Non-static method (instance variable use karta hai)
    public void printArray() {
        System.out.println("Printing using non-static method:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 🟢 Static method (object data use nahi karta)
    public static void printGivenArray(int[] array) {
        System.out.println("Printing using static method:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Object banana padega non-static ke liye
        StaticVsNonStatic obj = new StaticVsNonStatic();

        // 🔵 Non-static call
        obj.printArray();

        // 🟢 Static call (direct class se)
        int[] newArr = {1, 2, 3, 4};
        StaticVsNonStatic.printGivenArray(newArr);

        // Same class me static method ko direct bhi call kar sakte hai.
        printGivenArray(newArr);
    }
}


// Same class me static method direct bhi call ho jaayega.
// Ya fir className.methodName() se bhi call kr skte hai.
/*
class Demo {

    public static void greet() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        greet();   // ✅ directly call ho gaya
    }
}
*/

// But agar different class ke static method ko call krna hai to
// ClassName.methodName() use krna hi padegaa.

/*
class A {
    public static void hello() {
        System.out.println("Hi");
    }
}

class B {
    public static void main(String[] args) {
        A.hello();   // ✅ correct
        // hello();  ❌ error
    }
}
 */

// Agar method non-static hai to main me usko call krne ke liye
// object banana hi padega.

/*
class C {

    public void hello() {   // ❌ ab static nahi hai
        System.out.println("Hi");
    }
}

class D {

    public static void main(String[] args) {

        // A.hello(); ❌ ERROR (non-static method cannot be referenced from static context)

        C obj1 = new C();   // ✅ object banana zaroori
        obj1.hello();       // ✅ correct way
    }
}
*/