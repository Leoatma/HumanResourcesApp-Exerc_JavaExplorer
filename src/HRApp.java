import java.util.Arrays;

public class HRApp {

    public static void main(String[] args) {

        System.out.println("Human Resources App Starts!");

        // Creating new object Employee named 'salesManager', with (ID, Name, salary)
       Employee salesManager = new Employee(43, "Albert", 4700.00);

       //Creating new Department object named "Sales"
        Department depNumb_01 = new Department("Sales");

        // Adding employees to dep
        depNumb_01.addEmployee(salesManager);
        depNumb_01.addEmployee(new Employee(12, "John", 1200));
        depNumb_01.addEmployee(new Employee(51, "Chico", 2400));
        depNumb_01.addEmployee(new Employee(76, "Jose", 3200));

        System.out.println(depNumb_01); // Print all the atributes of the department (name and employees)
        System.out.println(Arrays.toString(depNumb_01.getDepEmployees())); // Print the list of employees from that dep

        System.out.println(depNumb_01.getEmployeeById(122)); // getting a null value
        System.out.println(depNumb_01.getEmployeeById(76)); // getting the employee atributes by id

        System.out.println("Total Salary: " + depNumb_01.getTotalSalary());
        System.out.println("Average Salary: " + depNumb_01.getAverageSalary());

        System.out.println("\n\nSession Done. Thank you for join Us!");

    }
}