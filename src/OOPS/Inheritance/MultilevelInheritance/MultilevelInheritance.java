package OOPS.Inheritance.MultilevelInheritance;
class Person{
    private String name;
    public void setName(String name ){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
class Employee extends Person{
    private int empId;
    public void setEmpId(int empId){
        this.empId = empId;
    }
    public int getEmpId(){
        return empId;
    }
}

class Manager extends Employee{
    private String department;
    public void setDepartment(String dept){
        this.department = dept;
    }
    public String getDepartment(){
        return department;
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setName("Ashutosh");
        m.setEmpId(100);
        m.setDepartment("Sales");

        System.out.println("Name: "+m.getName());
        System.out.println("Employee Id: "+m.getEmpId());
        System.out.println("Department: "+m.getDepartment());
    }
}

// METHOD 2
/*package OOPS.Inheritance.MultilevelInheritance;
class Person {
    public String name;
}

class Employee extends Person {
    public int empId;
}

class Manager extends Employee {
    public String department;
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Raj";
        m.empId = 102;
        m.department = "Sales";

        System.out.println("Name: " + m.name);
        System.out.println("Emp ID: " + m.empId);
        System.out.println("Department: " + m.department);
    }
}*/
