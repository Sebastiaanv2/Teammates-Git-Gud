package Teammates.git.gud;

public class InstructorRESTService {
    public Instructor updateInstructorOfCourse(String instructorId, String courseId) {
        InstructorApplicationService service = new InstructorApplicationService();
        return service.updateInstructorOfCourse(instructorId, courseId);
    }
}
