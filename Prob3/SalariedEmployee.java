package L5.Prob3;

public class SalariedEmployee extends Employee{
    private double weeklySalary;
    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary)
    {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPayment() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "Salaried Employee: " +
                "First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", SSN='" + ssn + '\'' +
                ", Weekly Salary=" + weeklySalary;

    }
}
