package JAVA.Structural;

import java.util.*;

// Component Interface
interface Employee {
    String getName();
    String getRole();
    void showEmployeeDetails();
}

// Leaf: Represents individual employees
class Developer implements Employee {
    private String name;
    private String role;

    public Developer(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getRole() {
        return this.role;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(getName() + " works as a " + getRole());
    }
}

// Leaf: Represents individual employees
class Manager implements Employee {
    private String name;
    private String role;

    public Manager(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getRole() {
        return this.role;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(getName() + " works as a " + getRole());
    }
}

// Composite: Represents a group of employees (team or department)
class CompanyDirectory implements Employee {
    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    @Override
    public String getName() {
        return null; // Composite doesn't have a name
    }

    @Override
    public String getRole() {
        return null; // Composite doesn't have a role
    }

    @Override
    public void showEmployeeDetails() {
        for (Employee employee : employeeList) {
            employee.showEmployeeDetails();
        }
    }
}

public class CompositePatternDemo {
    public static void main(String[] args) {
        // Create individual employees (Leaf)
        Employee developer1 = new Developer("John Doe", "Frontend Developer");
        Employee developer2 = new Developer("Jane Smith", "Backend Developer");
        Employee manager1 = new Manager("Alice Brown", "Project Manager");

        // Create a composite structure (team or department)
        CompanyDirectory engineeringDirectory = new CompanyDirectory();
        engineeringDirectory.addEmployee(developer1);
        engineeringDirectory.addEmployee(developer2);
        
        CompanyDirectory managementDirectory = new CompanyDirectory();
        managementDirectory.addEmployee(manager1);

        // Create the root of the hierarchy (Company)
        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.addEmployee(engineeringDirectory);
        companyDirectory.addEmployee(managementDirectory);

        // Show all employees
        System.out.println("Company Employee Directory:");
        companyDirectory.showEmployeeDetails();
    }
}
