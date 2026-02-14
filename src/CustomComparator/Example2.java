package CustomComparator;
import java.util.*;
public class Example2 {
    public static class Student {
        int roll;
        double per;
        String name;

        Student(int roll, double per, String name) {
            this.roll = roll;
            this.per = per;
            this.name = name;
        }
    }
    public static void print(Student[] arr){
        for(Student s : arr){
            System.out.println(s.name + " " + s.per + " " + s.roll);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Student[] s = {
                new Student(101, 99.9, "Ashutosh"),
                new Student(102, 98.9, "Jack"),
                new Student(103, 99.8, "Rocky"),
                new Student(104, 99.6, "John")
        };

        System.out.println("Original:");
        print(s);

        Arrays.sort(s, Comparator.comparing(st -> st.name));
        System.out.println("Sorted by name:");
        print(s);


        Arrays.sort(s, Comparator.comparingDouble(st -> st.per));
        System.out.println("Sorted by percentage:");
        print(s);

        Arrays.sort(s, Comparator.comparingInt(st -> st.roll));
        System.out.println("Sorted by roll:");
        print(s);
    }
}
