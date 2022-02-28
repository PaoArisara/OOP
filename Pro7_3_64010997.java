import java.util.Date;

public class Pro7_3_64010997
{
    public static void main(String[] args) {
        String name = "Aris",address = "Airport",phoneNumber = "0631968905",emailAddress = "64010997@kmitl.ac.th";
        Person person = new Person(name,address,phoneNumber,emailAddress);
		Student student = new Student(name,address,phoneNumber,emailAddress,Student.SENIOR);
		Employee employee = new Employee(name,address,phoneNumber,emailAddress,"KMITL", 1000000);
		Faculty faculty = new Faculty(name,address,phoneNumber,emailAddress,"KMITL",1000000,"24",1);
		Staff staff = new Staff(name,address,phoneNumber,emailAddress,"KMITL", 1000000, "First");
		
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
        
    }
}