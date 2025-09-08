package L5.Prob3;

public abstract class Employee {
    String firstName;
    String lastName;
    String ssn;

    public Employee(String firstName, String lastName, String ssn)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public abstract double getPayment();

    @Override
    public String toString() {
        return "Employee: " +
                "First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", SSN='" + ssn;

    }


}
