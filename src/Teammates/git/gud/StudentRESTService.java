package Teammates.git.gud;

import java.util.ArrayList;

public class StudentRESTService {
    public ArrayList<Course> getCoursesOfStudent(String googleId) {
        StudentApplicationService service = new StudentApplicationService();
        return service.getCoursesOfStudent(googleId);
    }
}