package OOPS;
public class Candidate {
    int rollNo = 101; // Instance variable
    static String college = "College"; //Static variable
    void display(){ // Non-static method
        int marks = 100; // Local variable
        
        System.out.println("Roll no: "+rollNo); //Instance
        System.out.println("College: "+college); //Static
        System.out.println("Marks: "+marks); //Local
    }

    public static void main(String[] args) {
        Candidate s = new Candidate();
        s.display();
    }
}
