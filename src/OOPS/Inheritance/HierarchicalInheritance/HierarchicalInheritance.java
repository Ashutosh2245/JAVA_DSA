package OOPS.Inheritance.HierarchicalInheritance;
class Person{
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
class Student extends Person{
    private int rollNo;
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public int getRollNo(){
        return rollNo;
    }
}
class Teacher extends Person{
    private String Subject;
    public void setSubject(String sub){
        this.Subject = sub;
    }
    public String getSubject(){
        return Subject;
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Raj Gupta");
        s.setRollNo(242);
        System.out.println("Student: "+s.getName() +"\nRoll no: "+s.getRollNo());
        Teacher t = new Teacher();
        t.setName("Mighty Raju");
        t.setSubject("AIML");
        System.out.println("\nTeacher: "+t.getName()+"\nSubject: "+t.getSubject());
    }
}

//Method 2
/*package OOPS.Inheritance.HierarchicalInheritance;
class Person {
    public String name;
}

class Student extends Person {
    public int rollNo;
}

class Teacher extends Person {
    public String subject;
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Amit";
        s.rollNo = 12;

        Teacher t = new Teacher();
        t.name = "Priya";
        t.subject = "Math";

        System.out.println("Student: " + s.name + ", Roll No: " + s.rollNo);
        System.out.println("Teacher: " + t.name + ", Subject: " + t.subject);
    }
}*/
