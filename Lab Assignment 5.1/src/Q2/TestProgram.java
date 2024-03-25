package Q2;
import java.util.Date;

public class TestProgram {
    public static void main(String[] args) {
        Person person = new Person("Jonah Hill", "123 Hollywood Blvd", "555-1010", "jonahhill@example.com");
        Student student = new Student("Kanye West", "234 Music Ave", "555-2020", "kanyewest@example.com", Student.FRESHMAN);
        Employee employee = new Employee("Jim Duck", "345 Pond St", "555-3030", "jimduck@example.com", "Office 201", 50000, new Date());
        Faculty faculty = new Faculty("Kim Duck", "456 River Rd", "555-4040", "kimduck@example.com", "Office 202", 60000, new Date(), new int[][]{{9, 11}, {10, 12}}, "Professor");
        Staff staff = new Staff("Adam Johnston", "567 Art St", "555-5050", "adamjohnston@example.com", "Office 203", 40000, new Date(), "Administrator");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}