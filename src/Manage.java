import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manage {
    private List<Employee> list = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void showAllEmployees() {
        System.out.println("Show all Employees");
        for (Employee employee : list) {
            System.out.println("Name: " + employee.getName());
            System.out.println("homeTown: " + employee.getHomeTown());
            System.out.println("Salary: " + employee.getSalary());
        }
    }

    public void addNewEmp() {
        try{
            System.out.println("Enter number of employee: ");
            int n = sc.nextInt();sc.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.println("Enter employee's id: ");
                int id = sc.nextInt();sc.nextLine();
                System.out.println("Enter employee's name: ");
                String name = sc.nextLine();
                System.out.println("Enter employee's home town: ");
                String homeTown = sc.nextLine();
                System.out.println("Enter employee's salary: ");
                int salary = sc.nextInt();sc.nextLine();
                Employee employee = new Employee(id, name, homeTown, salary);
                list.add(employee);
            }
        }   catch (Exception e) {
            System.out.println("Error adding employee: " + e.getMessage());
            sc.nextLine(); // consume invalid input
        }
    }

    public void updateEmp(){

    }
}
