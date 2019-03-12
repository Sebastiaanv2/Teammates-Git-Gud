package Teammates.git.gud;

public class InstructorApplicationService {
    public Instructor updateCourseForInstructor(String googleId, String newCourseId) {
        InstructorRepository instructorRepo = new InstructorRepository();
        return instructorRepo.updateCourseForInstructor(googleId, newCourseId);
    }
}
