package Teammates.git.gud;

public class InstructorApplicationService {
    public Instructor updateInstructorOfCourse(String instructorId, String courseId) {
        InstructorRepository instructorRepo = new InstructorRepository();
        if (instructorRepo.archiveInstructorOfCourse(courseId)) {
            Instructor instructor = instructorRepo.findInstructorById(instructorId);
            instructor.setCourseId(courseId);
            return instructor;
        }
        return null;
    }
}
