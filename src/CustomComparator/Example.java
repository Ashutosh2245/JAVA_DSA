package CustomComparator;
class Student implements Comparable <Student> {
    int roll;
    double per;
    String name;
    Student (int roll, double per, String name){
        this.name = name;
        this.roll = roll;
        this.per = per;
    }
    public int compareTo(Student s){
        return this.roll - s.roll;
    }

}
public class Example {
    public static void print(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].name + " ");
            System.out.print(arr[i].per + " ");
            System.out.println(arr[i].roll + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Student[] s = new Student[4];
        s[0] = new Student(101, 99.9,"Ashutosh");
        s[1] = new Student(102, 98.9,"Jack");
        s[2] = new Student(103, 99.8,"Rocky");
        s[3] = new Student(104, 99.6,"John");
        print(s);
    }
}
