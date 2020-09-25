import java.util.List;

public class Project {

    private List<Employee> ITDevelopers;
    private List<Employee> marketingEmployees;
    private List<Employee> productionEmployees;

    public Project(List<Employee> developers, List<Employee> marketingEmployees, List<Employee> productionEmployees) {
        this.ITDevelopers = developers;
        this.marketingEmployees = marketingEmployees;
        this.productionEmployees = productionEmployees;
    }

    public void startProject() {
        for(Employee it_employee : ITDevelopers) {
            System.out.print(it_employee + ". ");
            it_employee.work();
        }

        System.out.println();

        for(Employee marketingEmployee : marketingEmployees) {
            System.out.print(marketingEmployee + ". ");
            marketingEmployee.work();
        }

        System.out.println();

        for(Employee productionEmployee : productionEmployees) {
            System.out.print(productionEmployee.toString() + ". ");
            productionEmployee.work();
        }
    }
}
