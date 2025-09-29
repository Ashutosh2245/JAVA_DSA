//INHERITANCE.

//Method 1 -->> Using extends keyword

/*package OOPS;
//Parent Class
class Person {
    public String name;
    public String address;
    public int age;
}
// Derived class
class Students extends Person{
    public int marks;
    public String grade;

    //Constructor
    Students(String name, String address, int age, int marks, String grade){
        this.name = name;
        this.age = age;
        this.address = address;
        this.marks = marks;
        this.grade = grade;
    }

    //normal method
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
        System.out.println("Marks: "+marks);
        System.out.println("Grade: "+grade);
    }
}
class TestApp{
    public static void main(String[] args) {
        Students s = new Students("Ashutosh","Bihar",20,100,"A");
        s.display();
    }
}*/

// Method 2

package OOPS;
class Students{
    //Instance variables
    String name;
    String address;
    int age;
    public int marks;
    public String grade;


    //Constructor
    Students(String name, String address, int age, int marks, String grade){
        System.out.println("Called during object creation....");
        this.name = name;
        this.age = age;
        this.address = address;
        this.marks = marks;
        this.grade = grade;
    }

    //normal method
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
        System.out.println("Marks: "+marks);
        System.out.println("Grade: "+grade);
    }
}
class TestApp{
    public static void main(String[] args) {
        Students s = new Students("Ashutosh","Bihar",20,100,"A");
        s.display();
    }
}