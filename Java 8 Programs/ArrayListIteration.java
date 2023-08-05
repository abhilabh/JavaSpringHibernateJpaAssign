import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private String address;
    private double salary;

    Employee(int id, String name, String address, Double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    // Static method to compare employees based on salaries
    public static int compareBySal(Employee e1, Employee e2) {
        return Double.compare(e1.getSalary(), e2.getSalary());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class ArrayListIteration {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee emp = new Employee(1, "Rahul singh", "3rd A main bangalore", 10000.0);
        employees.add(emp);
        emp = new Employee(2, "shruti", "713, koramangala bangalore", 8000.0);
        employees.add(emp);
        emp = new Employee(3, "Krishna", "142, hsr, bangalore ", 11000.0);
        employees.add(emp);

        Collections.sort(employees, Employee::compareBySal);

        employees.forEach(employee -> {
            System.out.println("ID: " + employee.getId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Address: " + employee.getAddress());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
        });
    }
}
