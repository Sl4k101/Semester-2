package Q2;
import java.util.Date;

public class Faculty extends Employee{
    private int[][] officeHours = new int[5][2];
    private String rank;

    public Faculty() {}

    public Faculty(String name, String address, String phoneNumber, String emailAddress, 
        String office, double salary, Date dateHired, int[][] officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        setOfficeHours(officeHours);
        this.rank = rank;
    }

    // Getters
    public int[][] getOfficeHours() {
        return officeHours.clone();
    }

    public String getRank() {
        return rank;
    }

    // Setters
    public void setOfficeHours(int[][] officeHours) {
        for(int i = 0; i < officeHours.length; i++) {
            if(officeHours[i].length % 2 != 0) {
                System.out.println("Warning! Invalid office hours, open ranges cannot be set! No office hours were set as a result.");
                return;
            }
        }
        this.officeHours = officeHours.clone();
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString() {
        String info = "Faculty Member\n - name = " + this.getName() + 
            "\n - address = " + this.getAddress() + 
            "\n - phoneNumber = " + this.getPhoneNumber() + 
            "\n - emailAddress = " + this.getEmailAddress() +
            "\n - office = " + this.getOffice() +
            "\n - salary = $" + this.getSalary() +
            "\n - dateHired = " + this.getDateHired().toString() +
            "\n - rank = " + this.getRank() + 
            "\n - office hours = {";
        

        for(int i = 0; i < officeHours.length; i++) {
            info += "\n\tday " + (i + 1) + " in schedule: { ";

            for(int j = 1; j < officeHours[i].length ; j += 2) {
                if(officeHours[i][j] == officeHours[i][j - 1]) {
                    info += "No Office Hours";
                    continue;
                }

                info += (officeHours[i][j - 1] + " to " + officeHours[i][j] + (j == officeHours[i].length - 1 ? "": ", "));
            }

            info += " } ";
        }

        return info += "\n   }";
    }
}