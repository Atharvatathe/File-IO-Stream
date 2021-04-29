import java.util.Scanner;

public class EmployeePayrollService {
    public int id;
    public String name;
    public double salary;

    public void setEmployeeData()
    {
        Scanner employee = new Scanner(System.in);
        System.out.println("Enter the Name of Employee");
        this.name = employee.nextLine();
        System.out.println("Enter the ID of Employee");
        this.id = employee.nextInt();
        System.out.println("Enter the salary of Employee");
        this.salary = employee.nextDouble();
    }

    public void getEmployeeData(){
        System.out.println("Employee Name: " +name);
        System.out.println("Employee ID: " +id);
        System.out.println("Employee Salary: " +salary);
    }

    public static void main(String[] args){
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        employeePayrollService.setEmployeeData();
        employeePayrollService.getEmployeeData();
    }
}

