package OOPS.Encapsulation.EncapsulationExample;
class Rectangle {
    private float length;
    private float breadth;

    public void setLength(float length) {
        if (length > 0) {
            this.length = length;
        } else System.out.println("Invalid Length");
    }
    public void setBreadth(float breadth) {
        if (breadth > 0) {
            this.breadth = breadth;
        } else System.out.println("Invalid Breadth");
    }
    public float getArea() {
        return length * breadth;
    }
}

class Circle{
    private float radius;
    public void setRadius(float radius){
        if(radius>0){
            this.radius = radius;
        }
        else System.out.println("Invalid Radius");
    }
    public float getArea(){
        return (float)(Math.PI*radius*radius);
    }
}
public class Shape{
    public static void main(String[] args) {
        Rectangle Rec = new Rectangle();
        Rec.setLength(4);
        Rec.setBreadth(5);

        Circle C = new Circle();
        C.setRadius(5);

        System.out.println("Area of Rectangle: "+Rec.getArea());
        System.out.println("Area of Circle: "+ C.getArea());
    }
}
