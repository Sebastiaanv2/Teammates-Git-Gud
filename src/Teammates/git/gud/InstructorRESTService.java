package Teammates.git.gud;

public class InstructorRESTService {
    public Instructor updateCourseOfInstructor(String googleId, String newCourseId) {
        InstructorApplicationService service = new InstructorApplicationService();
        return service.updateCourseOfInstructor(googleId, newCourseId);
    }
}
