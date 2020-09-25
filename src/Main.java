public class Main {
    public static void main(String[] args) {
        Employee CEO = new Employee("Mark", "Markson", 1000, "CEO");
        Employee emp1 = new ProxyMarketingEmployee("Simon", "Brian", 3000);
        Employee emp2 = new ProxyMarketingEmployee("Jonathan", "Joestar", 3000);
        Employee emp3 = new ProxyIT_Employee("Elon", "Musk", 7000);
        Employee emp4 = new ProxyIT_Employee("John", "Smith", 5000);
        Employee emp5 = new ProxyIT_Employee("William", "Wilter", 5000);
        Employee emp6 = new ProxyIT_Employee("Alexander", "lee",  6000);
        Employee emp7 = new ProxyProductionEmployee("Emily", "Harris", 5000);
        Employee emp8 = new ProxyProductionEmployee("Alan", "Walker", 4000);
        Employee emp9 = new ProxyProductionEmployee("Jack", "Martin", 4000);
        Employee emp10 = new ProxyProductionEmployee("Mila", "White", 4000);

        emp1.addEmployee(emp2);

        emp3.addEmployee(emp4);
        emp3.addEmployee(emp5);
        emp3.addEmployee(emp6);

        emp7.addEmployee(emp8);
        emp7.addEmployee(emp9);
        emp7.addEmployee(emp10);

        CEO.addEmployee(emp1);
        CEO.addEmployee(emp3);
        CEO.addEmployee(emp7);

        Project project = new Project(emp3.getEmployeeList(), emp1.getEmployeeList(), emp7.getEmployeeList());
        project.startProject();
    }
}
