package OOPS;
class Man {
    //Instance variable
    String name;
    int age;

    //constructor
    Man(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name: "+name );
        System.out.println("Age: "+age);
    }
}
public class InstanceVariable{
    public static void main(String[] args) {
        Man m1 = new Man("Ashutosh",20);
        Man m2 = new Man ("Raja",21);
        m1.display();
        System.out.println();
        m2.display();
    }
}
