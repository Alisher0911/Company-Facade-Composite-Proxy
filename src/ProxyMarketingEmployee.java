public class ProxyMarketingEmployee extends Employee implements IEmployee {
    private MarketingEmployee marketingEmployee;

    private String name;
    private String surname;
    private int salary;

    public ProxyMarketingEmployee(String name, String surname, int salary) {
        super(name, surname, salary, "Marketing");
    }

    @Override
    public void work() {
        if(marketingEmployee == null) {
            marketingEmployee = new MarketingEmployee(name, surname, salary);
        }
        marketingEmployee.work();
    }
}
