package Teammates.git.gud;

public class InstructorApplicationService {
    public Instructor updateCourseOfInstructor(String googleId, String courseId) {
        InstructorRepository instructorRepo = new InstructorRepository();
        if (instructorRepo.updateCourseOfInstructor(courseId)) {
            Instructor instructor = instructorRepo.findInstructorById(googleId);
            instructor.setCourseId(courseId);
            return instructor;
        }
        return null;
    }
}
