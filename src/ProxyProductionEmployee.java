public class ProxyProductionEmployee extends Employee implements IEmployee {
    private ProductionEmployee productionEmployee;

    private String name;
    private String surname;
    private int salary;

    public ProxyProductionEmployee(String name, String surname, int salary) {
        super(name, surname, salary, "Production");
    }

    @Override
    public void work() {
        if(productionEmployee == null) {
            productionEmployee = new ProductionEmployee(name, surname, salary);
        }
        productionEmployee.work();
    }
}
