package Teammates.git.gud;

public class InstructorRESTService {
    public Instructor updateCourseForInstructor(String googleId, String newCourseId) {
        InstructorApplicationService service = new InstructorApplicationService();
        return service.updateCourseForInstructor(googleId, newCourseId);
    }
}
