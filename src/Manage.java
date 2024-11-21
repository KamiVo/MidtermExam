//package EmpManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manage {
    List<Employee> listEmployee = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void showAllEmployees() {
        if (listEmployee.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }

        // in ra danh sách nhân viên
        System.out.printf("%-10s %-20s %-20s %-10s%n", "ID", "Name", "Hometown", "Salary");
        System.out.println("---------------------------------------------------------------");

        // in ra thông tin từng nhân viên
        for (Employee emp : listEmployee) {
            System.out.printf("%-10d %-20s %-20s %-10d%n", emp.getId(), emp.getName(), emp.getHomeTown(), emp.getSalary());
        }
    }

    public void addNewEmployee() { // thêm nhân viên mới
        try {
            System.out.println("Enter the number of employees you want to add: "); // nhập số lượng nhân viên cần thêm
            int amount = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < amount; i++) {
                System.out.print("Enter employee's ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter employee's name: ");
                String name = sc.nextLine();
                System.out.print("Enter employee's hometown: ");
                String homeTown = sc.nextLine();
                System.out.print("Enter employee's salary: ");
                int salary = sc.nextInt();
                sc.nextLine();

                Employee employee = new Employee(id, name, homeTown, salary);
                listEmployee.add(employee);
                System.out.println("Employee " + (i + 1) + " added successfully!");
            }
        } catch (Exception e) {
            System.out.println("Error adding employee: " + e.getMessage());
            sc.nextLine();
        }
    }

    public void editEmployeeById() { // chỉnh sửa thông tin nhân viên
        try {
            System.out.print("Enter employee's ID to edit: "); // nhập ID nhân viên cần chỉnh sửa
            int id = sc.nextInt();
            sc.nextLine();
            Employee employee = null;
            for (Employee emp : listEmployee) {
                if (emp.getId() == id) { // nếu ID của nhân viên trong danh sách trùng với ID nhập vào
                    employee = emp;
                    break;
                }
            }
            if (employee == null) { // nếu không tìm thấy nhân viên
                System.out.println("Employee not found!");
                return;
            }
            System.out.println("==================================");
            System.out.println("|   Choose information to edit   |");
            System.out.println("==================================");
            System.out.println("| 1. Update new name             |");
            System.out.println("| 2. Update new homeTown         |");
            System.out.println("| 3. Update new salary           |");
            System.out.println("| 4. Update all                  |");
            System.out.println("==================================");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) { // chọn thông tin cần chỉnh sửa
                case 1: // cập nhật tên
                    System.out.print("Enter new name: ");
                    String name = sc.nextLine();
                    employee.setName(name);
                    System.out.println("Name updated successfully!");
                    break;
                case 2: // cập nhật quê quán
                    System.out.print("Enter new hometown: ");
                    String homeTown = sc.nextLine();
                    employee.setHomeTown(homeTown);
                    System.out.println("Hometown updated successfully!");
                    break;
                case 3: // cập nhật lương
                    System.out.print("Enter new salary: ");
                    int salary = sc.nextInt();
                    employee.setSalary(salary);
                    System.out.println("Salary updated successfully!");
                    break;
                case 4: // cập nhật tất cả thông tin
                    System.out.print("Enter new name: ");
                    name = sc.nextLine();
                    employee.setName(name);
                    System.out.print("Enter new hometown: ");
                    homeTown = sc.nextLine();
                    employee.setHomeTown(homeTown);
                    System.out.print("Enter new salary: ");
                    salary = sc.nextInt();
                    employee.setSalary(salary);
                    System.out.println("All information updated successfully!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } catch (Exception e) {
            System.out.println("Error editing employee: " + e.getMessage());
            sc.nextLine();
        }
    }
}