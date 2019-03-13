package Teammates.git.gud.services;

import Teammates.git.gud.repositories.InstructorRepository;
import Teammates.git.gud.models.Instructor;

public class InstructorApplicationService {
    public Instructor updateCourseForInstructor(String googleId, String newCourseId) {
        InstructorRepository instructorRepo = new InstructorRepository();
        return instructorRepo.updateCourseForInstructor(googleId, newCourseId);
    }
}
