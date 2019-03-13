package Teammates.git.gud.restServices;

import Teammates.git.gud.models.Course;
import Teammates.git.gud.services.StudentApplicationService;

import java.util.ArrayList;

public class StudentRESTService {
    public ArrayList<Course> GetCoursesForStudent(String googleId) {
        StudentApplicationService service = new StudentApplicationService();
        return service.getCoursesForStudent(googleId);
    }
}
