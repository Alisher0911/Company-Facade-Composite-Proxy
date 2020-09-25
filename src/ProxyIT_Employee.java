public class ProxyIT_Employee extends Employee implements IEmployee {
    private IT_Employee it_employee;

    private String name;
    private String surname;
    private int salary;

    public ProxyIT_Employee(String name, String surname, int salary) {
        super(name, surname, salary, "IT Developer");
    }

    @Override
    public void work() {
        if(it_employee == null) {
            it_employee = new IT_Employee(name, surname, salary);
        }
        it_employee.work();
    }
}
