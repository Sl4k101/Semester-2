package Q2;
import java.util.Date;

public class Staff extends Employee{
    String title;

    public Staff() {} // no-arg

    public Staff(String name, String address, String phoneNumber, String emailAddress,
        String office, double salary, Date dateHired, String title) { // all-arg
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired); // invoke employee's all-arg constructor
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee\n");
        sb.append(" - name = ").append(this.getName()).append("\n");
        sb.append(" - address = ").append(this.getAddress()).append("\n");
        sb.append(" - phoneNumber = ").append(this.getPhoneNumber()).append("\n");
        sb.append(" - emailAddress = ").append(this.getEmailAddress()).append("\n");
        sb.append(" - office = ").append(this.getOffice()).append("\n");
        sb.append(" - salary = $").append(String.format("%.2f", this.getSalary())).append("\n");
        sb.append(" - dateHired = ").append(this.getDateHired().toString()).append("\n");
        sb.append(" - title = ").append(this.title);
        return sb.toString();
    }
}