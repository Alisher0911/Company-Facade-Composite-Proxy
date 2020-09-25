public class IT_Employee extends Employee implements IEmployee {
    public IT_Employee(String name, String surname, int salary) {
        super(name, surname, salary, "IT Developer");
    }

    @Override
    public void work() {
        System.out.println("Working with Frontend and Backend.");
    }
}
