public class Employee {
    private int id;
    private String name;
    private String homeTown;
    private int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.homeTown = position;
        this.salary = salary;
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
