package Teammates.git.gud;

public class Main {

    public static void main(String[] args) {
        StudentRESTService service = new StudentRESTService();
        System.out.println(service.GetCoursesOfStudent("001"));

        InstructorRESTService service1 = new InstructorRESTService();
        System.out.println(service1.updateCourseOfInstructor("003", "002"));
    }
}
