package OOPS.Inheritance.Interface;
interface A {
    void show();
}
interface B {
    void display();
}
class C implements A, B {
    public void show() {
        System.out.println("Showing from A");
    }

    public void display() {
        System.out.println("Displaying from B");
    }
}
public class Interface {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
    }
}

// METHOD 2
/*package OOPS.Inheritance.Interface;
interface A {
    void show();
}

interface B {
    void display();
}

class C implements A, B {
    public void show() {
        System.out.println("From Interface A");
    }

    public void display() {
        System.out.println("From Interface B");
    }
}

public class Interface {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
    }
}*/
