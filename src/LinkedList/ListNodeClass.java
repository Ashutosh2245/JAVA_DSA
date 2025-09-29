// Non parameterised
/*
package LinkedList;
class Car{
    int price;
    String name;
    Car(){
    }
}
public class ListNodeClass {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "Tata";
        c1.price = 10000;
        System.out.println(c1.name+" "+c1.price);

    }
}
*/

// Parameterised
package LinkedList;
class Car{
    int price;
    String name;
    Car(int price, String name){
        this.price = price;
        this.name = name;
    }
}
public class ListNodeClass {
    public static void main(String[] args) {
        Car c1 = new Car(1222222,"Tata");
        System.out.println("Car Name: " + c1.name);
        System.out.println("Car Price: " + c1.price);
    }
}
