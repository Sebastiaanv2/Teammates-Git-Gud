package Teammates.git.gud;

import Teammates.git.gud.restServices.InstructorRESTService;
import Teammates.git.gud.restServices.StudentRESTService;

public class Main {

    public static void main(String[] args) {

        System.out.println();

        System.out.println("get courses for student with googleId: 001");
        StudentRESTService service = new StudentRESTService();
        System.out.println(service.GetCoursesForStudent("001"));

        System.out.println();

        System.out.println("update course for instructor with googleId: 003 and set it to: 002");
        InstructorRESTService service1 = new InstructorRESTService();
        System.out.println(service1.updateCourseForInstructor("003", "002"));
    }
}
