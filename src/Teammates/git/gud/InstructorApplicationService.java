package Teammates.git.gud;

public class InstructorApplicationService {
    public Instructor updateCourseOfInstructor(String googleId, String newCourseId) {
        InstructorRepository instructorRepo = new InstructorRepository();
        return instructorRepo.updateCourseOfInstructor(googleId, newCourseId);
    }
}
