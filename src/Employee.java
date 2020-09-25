import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String surname;
    private int salary;
    private String position;
    private List<Employee> employeeList;

    private String projectName;

    public Employee(String name, String surname, int salary, String position) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.position = position;
        employeeList = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    public List<Employee> getEmployeeList() {
        employeeList.add(this);
        return employeeList;
    }

    public String toString() {
        return "Employee: Name - " + name + ", Surname - " + surname +
                ", Salary - " + salary + ", position - " + position;
    }

    public void work() {
        System.out.println("Doing specific job.");
    }
}
