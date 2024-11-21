//package EmpManagement;
import java.util.Scanner;

public class Main {
    public static void showMenu() {
        System.out.println("==================================");
        System.out.println("|          Main Menu             |");
        System.out.println("==================================");
        System.out.println("| 1. Show all Employees          |");
        System.out.println("| 2. Add new Employee            |");
        System.out.println("| 3. Update Employee             |");
        System.out.println("| 4. Exit                        |");
        System.out.println("==================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manage mn = new Manage();
        while (true) {
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    mn.showAllEmployees();
                    break;
                case 2:
                    mn.addNewEmployee();
                    break;
                case 3:
                    mn.editEmployeeById();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}