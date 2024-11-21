//package EmpManagement;

public class Employee {
    private int id;
    private String name;
    private String homeTown;
    private int salary;

    public Employee(int id, String name, String homeTown, int salary) {
        this.id = id;
        this.name = name;
        this.homeTown = homeTown;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}