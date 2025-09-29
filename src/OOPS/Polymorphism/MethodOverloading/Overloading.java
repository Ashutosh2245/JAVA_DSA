package OOPS.Polymorphism.MethodOverloading;
class Calculator{
    public void add(int a, int b){
        System.out.println("int-int argument");
    }
    public void add(float a , float b){
        System.out.println("float-float argument");
    }
    public void add(double a, double b){
        System.out.println("double-double argument");
    }
}
public class Overloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10,20); //int-int
        c.add(2.3f,5.6f); //float-float
        c.add(2.455666,5.667543); //double-double
    }
}
