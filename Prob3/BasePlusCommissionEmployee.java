package L5.Prob3;

public class BasePlusCommissionEmployee extends CommissionEmployee{

    private double baseSalary;
    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commisionRate, double baseSalary) {
        super(firstName, lastName, ssn, grossSales, commisionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPayment() {
        return baseSalary + grossSales * commisionRate;
    }

    @Override
    public String toString() {
        return "Base Plus Commission Employee: " +
                "First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", SSN='" + ssn + '\'' +
                ", Gross Sales=" + grossSales +
                ", Commission Rate=" + commisionRate +
                ", Base Salary=" + baseSalary;

    }
}
