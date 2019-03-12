package Teammates.git.gud;

import java.util.ArrayList;

public class StudentApplicationService {
    public ArrayList<Course> getCoursesForStudent(String googleId) {
        StudentRepository studentRepo = new StudentRepository();
        Student student = studentRepo.getStudentsForGoogleId(googleId);

        CourseRepository courseRepo = new CourseRepository();
        ArrayList<Course> courses = new ArrayList<Course>();

        for (int i = 0; i < student.getCourses().size(); i++) {
            courses.add(courseRepo.getCourse(student.getCourses().get(i)));
        }
        return courses;
    }
}
