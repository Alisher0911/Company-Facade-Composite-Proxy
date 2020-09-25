public class ProductionEmployee extends Employee implements IEmployee {

    public ProductionEmployee(String name, String surname, int salary) {
        super(name, surname, salary, "Production");
    }

    @Override
    public void work() {
        System.out.println("Scheduling production, ensuring product quality, improving existing products.");
    }
}