package Teammates.git.gud.restServices;

import Teammates.git.gud.models.Instructor;
import Teammates.git.gud.services.InstructorApplicationService;

public class InstructorRESTService {
    public Instructor updateCourseForInstructor(String googleId, String newCourseId) {
        InstructorApplicationService service = new InstructorApplicationService();
        return service.updateCourseForInstructor(googleId, newCourseId);
    }
}
