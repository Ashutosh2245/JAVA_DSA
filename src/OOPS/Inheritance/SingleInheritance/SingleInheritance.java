package OOPS.Inheritance.SingleInheritance;
class Person{
    private String name;
    public void setName(String name){
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
//public class SingleInheritance {
//    public static void main(String[] args) {
//        Employee e = new Employee();
//        e.setName("Ashutosh");
//        e.setEmpId(100);
//
//        System.out.println("Name: "+ e.getName());
//        System.out.println("Employee ID: "+e.getEmpId());
//    }
//}

//Method 2
/*package OOPS.Inheritance.SingleInheritance;
class Person {
    public String name;
}

class Employee extends Person {
    public int empId;
}

public class SingleInheritance {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Ashutosh";
        e.empId = 101;

        System.out.println("Name: " + e.name);
        System.out.println("Employee ID: " + e.empId);
    }
}
*/