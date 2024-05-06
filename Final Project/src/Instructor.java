public class Instructor extends Person {
    private String officeNumber;

    public Instructor(String name, String familyName, String officeNumber) {
        setName(name);
        setFamilyName(familyName);
        this.officeNumber = officeNumber;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    @Override
    public String toString() {
        return "Instructor: " + getName() + " " + getFamilyName() + ", Office: " + officeNumber;
    }
}
