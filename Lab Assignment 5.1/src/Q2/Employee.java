package Q2;
import java.util.Date;

public class Employee extends Person {
    private String office;
    private double salary;
    private Date dateHired;

    public Employee() {}

    public Employee(String name, String address, String phoneNumber, String emailAddress, 
        String office, double salary, Date dateHired) {
        super(name, address, phoneNumber, emailAddress); // invoke Person's all-arg constructor
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    // Getters
    public String getOffice() {
        return this.office;
    }

    public double getSalary() {
        return this.salary;
    }

    public Date getDateHired() {
        return this.dateHired;
    }

    // Setters
    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee\n");
        sb.append(" - name = ").append(getName()).append("\n");
        sb.append(" - address = ").append(getAddress()).append("\n");
        sb.append(" - phoneNumber = ").append(getPhoneNumber()).append("\n");
        sb.append(" - emailAddress = ").append(getEmailAddress()).append("\n");
        sb.append(" - office = ").append(office).append("\n");
        sb.append(" - salary = $").append(salary).append("\n");
        sb.append(" - dateHired = ").append(dateHired.toString());
        return sb.toString();
    }
}