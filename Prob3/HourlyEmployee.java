package L5.Prob3;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hours)
    {
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.hours = hours;
    }
    @Override
    public double getPayment() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee: " +
                "First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", SSN='" + ssn + '\'' +
                ", Wage=" + wage +
                ", Hours=" + hours;

    }
}
