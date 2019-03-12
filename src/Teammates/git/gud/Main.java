package Teammates.git.gud;

public class Main {

    public static void main(String[] args) {
        StudentRESTService service = new StudentRESTService();
        System.out.println(service.GetCoursesForStudent("001"));

        InstructorRESTService service1 = new InstructorRESTService();
        System.out.println(service1.updateCourseForInstructor("003", "002"));
    }
}
