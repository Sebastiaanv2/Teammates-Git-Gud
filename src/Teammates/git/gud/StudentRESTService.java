package Teammates.git.gud;

import java.util.ArrayList;

public class StudentRESTService {
    public ArrayList<Course> GetCoursesForStudent(String googleId) {
        StudentApplicationService service = new StudentApplicationService();
        return service.getCoursesForStudent(googleId);
    }
}
