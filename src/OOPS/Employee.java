package OOPS;
class Employee {
    //Instance variable
    String name;
    int age;

    //Zero argument constructor
    Employee(){
        System.out.println("Employee constructor called");
    }

    //Instance method
    public void display(){
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
    }
}
class Test{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.display();
    }
}

//Result will be null for string and zero for integer.