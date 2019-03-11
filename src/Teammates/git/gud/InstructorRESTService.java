package Teammates.git.gud;

public class InstructorRESTService {
    public Instructor updateCourseOfInstructor(String googleId, String courseId) {
        InstructorApplicationService service = new InstructorApplicationService();
        return service.updateCourseOfInstructor(googleId, courseId);
    }
}
