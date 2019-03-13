package Teammates.git.gud.services;

import Teammates.git.gud.models.Course;
import Teammates.git.gud.models.Student;
import Teammates.git.gud.repositories.CourseRepository;
import Teammates.git.gud.repositories.StudentRepository;

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
