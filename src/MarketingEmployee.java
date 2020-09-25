public class MarketingEmployee extends Employee implements IEmployee {
    public MarketingEmployee(String name, String surname, int salary) {
        super(name, surname, salary, "Marketing");
    }

    @Override
    public void work() {
        System.out.println("Improving sales processes and customer, defining strategic marketing plans.");
    }
}
