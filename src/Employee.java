public class Employee {
    private String fullName;
    private double salary;
    private String department;
    private static int id = 0;

    public Employee(String fullName, double salary, String department) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        idCount();
    }

    public void setName(String name) {
        this.fullName = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return this.fullName;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public static int getId() {
        return id;
    }

    public void idCount() {
        id++;
    }

    @Override
    public String toString() {
        return "ФИО: " + fullName + ", з/п: " + salary +
                ", " + department;
    }
}
