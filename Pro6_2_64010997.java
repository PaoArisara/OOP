import java.util.Objects;
public class Pro6_2_64010997
{
    public static void main(String[] agrs)
    {
        Course course = new Course("English");
        System.out.println(course.getCourseName());
        course.add("A");
        course.add("B");
        course.add("C");
        course.add("D");
        course.dropStudent("D");
        System.out.println("Students in the course " + course.getCourseName() + " are: ");
        for (String s : course.getStudent()) {
            if (Objects.nonNull(s)) {
                System.out.print(s + " ");
            }
    }
}
}