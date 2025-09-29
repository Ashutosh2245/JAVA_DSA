// Data hiding -->> Private access modifier
// ENCAPSULATION
package OOPS;
class Student {

    //Data Security
    private int rollNo;
    private String name;
    private String address;

    //setter methods
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }

    //getter methods
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
}

public class StudentApp{
    public static void main(String[] args) {
        Student s1 = new Student();
        //Calling setter methods
        s1.setRollNo(70);
        s1.setName("Ashutosh");
        s1.setAddress("Bihar");

        //Calling getter methods
        System.out.println("Name: "+s1.getName());
        System.out.println("Roll No: "+s1.getRollNo());
        System.out.println("Address: "+s1.getAddress());
    }
}
