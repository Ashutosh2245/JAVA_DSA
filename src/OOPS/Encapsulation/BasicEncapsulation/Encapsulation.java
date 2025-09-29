package OOPS.Encapsulation.BasicEncapsulation;
class Employees {
    // 1. Declare private variables (Data Hiding)
    private int id;
    private String name;
    private double salary;

    // 2. Public getter for id
    public int getId() {
        return id;
    }

    // 3. Public setter for id with validation
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Invalid ID! Must be positive.");
        }
    }

    // 4. Public getter for name
    public String getName() {
        return name;
    }

    // 5. Public setter for name with validation
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name! Cannot be empty.");
        }
    }

    // 6. Public getter for salary
    public double getSalary() {
        return salary;
    }

    // 7. Public setter for salary with validation
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary! Cannot be negative.");
        }
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Employees emp = new Employees();

        // Setting values using setters
        emp.setId(101);
        emp.setName("Ashutosh Kumar");
        emp.setSalary(75000);

        // Trying to set invalid values
        emp.setId(-5);          // Should print error message
        emp.setName("   ");     // Should print error message
        emp.setSalary(-1000);   // Should print error message

        // Getting values using getters
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}


