import java.util.Arrays;

public class Department {
    private String depName;

    private Employee[] depEmployees = new Employee[10];

    public Department(String depName) {
        this.depName = depName;
    }

   public Department(String departName, Employee[] depEmployees) {
        this.depName = departName;
        this.depEmployees = depEmployees;
    }

    @Override
    public String toString() {
        return "Department: " + getDepartName() + ".\n" + "Employees: " + Arrays.toString(getDepEmployees());
    }

    public String getDepartName() {
        return depName;
    }

    public void setDepartName(String departName) {
        this.depName = departName;
    }

    public Employee[] getDepEmployees() {
        int employeeCount = 0;
        for (int i = 9; i >= 0; i--) {
            if (depEmployees[i] != null) {
                employeeCount++;
            }
        }
        Employee[] actualEmployees = new Employee[employeeCount];
        for (int idx = 0; idx < depEmployees.length; idx++) {
            if (depEmployees[idx] != null) {
                actualEmployees[idx] = depEmployees[idx];
            }
        }
        System.out.printf("There are %d employees in this Department:\n", actualEmployees.length);
        return actualEmployees;
    }





    public void setDepEmployees(Employee[] depEmployees) {
        this.depEmployees = depEmployees;
    }

    public void addEmployee(Employee newEmployee) {
        for (int count = 0; count < 10; count++) {
            if (this.depEmployees[count] == null) {
                this.depEmployees[count] = newEmployee;
                break;
            }
        }
    }
    public Employee getEmployeeById(int id) {
        Employee employeeById = null;
        try {
            for (Employee employee : depEmployees) {
                if (employee.getID() == id) {
                    employeeById = employee;
                }
            }
        } catch (NullPointerException e) {
            if (employeeById == null) {
                System.out.print("Id não encontrado: ");
            }
        }
            return employeeById;
    }

    public double getTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : depEmployees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
            return totalSalary;
    }

    public double getAverageSalary() {
        int employeesCount = 0;
        for (Employee employee : depEmployees) {
            if (employee != null) {
                employeesCount++;
            }
        }
        return getTotalSalary() / employeesCount;
    }


}
