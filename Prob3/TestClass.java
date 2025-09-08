package L5.Prob3;

import java.util.Arrays;

public class TestClass {
    public static Employee[] findSalaryList(Employee[] col, double salary) {
        if (col == null) {
            return new Employee[0];
        }
        Employee[] result = new Employee[col.length];
        int count = 0;
        for (Employee emp : col) {
            if (emp != null && emp.getPayment() < salary) {
                result[count++] = emp;
            }
        }
        return Arrays.copyOf(result,count);
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new SalariedEmployee("Nur", "Ablikim", "123-456-789", 1000);
        employees[1] = new HourlyEmployee("Jane", "Smith", "987-654-321", 20, 40);
        employees[2] = new CommissionEmployee("Peter", "Jones", "111-222-333", 50000, 0.1);
        employees[3] = new BasePlusCommissionEmployee("Mary", "Williams", "444-555-666", 20000, 0.1, 500);
        employees[4] = new BasePlusCommissionEmployee("Tom", "Brown", "777-888-999", 5000, 0.15, 200);

        System.out.println("--- All Employee Details ---");
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }

        double salaryThreshold = 1000.00;
        Employee[] lowSalaryEmployees = findSalaryList(employees, salaryThreshold);

        System.out.println("--- Employees with payment less than $" + String.format("%.2f", salaryThreshold) + " ---");
        if (lowSalaryEmployees.length == 0) {
            System.out.println("No employees found with payment less than $" + String.format("%.2f", salaryThreshold) + ".");
        } else {
            for (Employee emp : lowSalaryEmployees) {
                System.out.println(emp.toString());
            }
        }
    }
}
