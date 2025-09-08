package L5.Prob3;

public class CommissionEmployee extends Employee{

    double grossSales;
    double commisionRate;

    public CommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commisionRate)
    {
        super(firstName, lastName, ssn);
        this.grossSales = grossSales;
        this.commisionRate = commisionRate;
    }



    @Override
    public double getPayment() {
        return grossSales * commisionRate;
    }

    @Override
    public String toString() {
        return "Commission Employee: " +
                " FirstName='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", SSN='" + ssn + '\'' +
                ", Gross Sales=" + grossSales +
                ", Commission Rate=" + commisionRate;

    }
}
