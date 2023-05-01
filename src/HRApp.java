import java.util.Arrays;

public class HRApp {

    public static void main(String[] args) {

        System.out.println("HRApp Starts");


       Employee salesManager = new Employee(43, "Albert", 4700.00);


        Department depNumb_01 = new Department("Sales");
        depNumb_01.addEmployee(salesManager);
        depNumb_01.addEmployee(new Employee(12, "John", 1200));
        depNumb_01.addEmployee(new Employee(51, "Chico", 2400));
        depNumb_01.addEmployee(new Employee(76, "Jose", 3200));

        System.out.println(depNumb_01);
        System.out.println(Arrays.toString(depNumb_01.getDepEmployees()));

        System.out.println(depNumb_01.getEmployeeById(122));
        System.out.println(depNumb_01.getEmployeeById(76));

        System.out.println("Total Salary: " + depNumb_01.getTotalSalary());
        System.out.println("Average Salary: " + depNumb_01.getAverageSalary());


    }
}