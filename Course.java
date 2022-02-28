import java.util.Arrays;

public class Course {
    private String Coursename;
    private String[] student = new String[100];
    private int numofstudent;

    public Course(String Coursename)
    {
        this.Coursename = Coursename;
    }

    public void add(String Student)
    {
        if (Student.length() < (numofstudent + 1)) {
            student = Arrays.copyOf(student, student.length * 2);
        }
        student[numofstudent] = Student;
        numofstudent++;
        System.out.println("Added student: " + student + " to the course: " + getCourseName());
    }

    public String[] getStudent()
    {
        return student;
    }

    public int getnumofstudent()
    {
        return numofstudent;
    }

    public String getCourseName()
    {
        return Coursename;
    }
    public void dropStudent(String student) {
        for (int i = 0; i < numofstudent; i++) {
            if (this.student[i].equals(student)) {
                this.student[i]= null;
                break;
            }
        }
        System.out.println("Dropped student: " + student + " has been dropped from " + getCourseName());
    }

    protected void clear() {
        Arrays.fill(this.student, null);
    }

}
