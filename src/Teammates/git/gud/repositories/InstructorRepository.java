package Teammates.git.gud.repositories;

import Teammates.git.gud.models.Instructor;
import Teammates.git.gud.models.Role;

import java.util.ArrayList;

public class InstructorRepository {
    private Instructor c = new Instructor("001", "001", false, "Gert", "Gert@hu.nl", "a3em6jd", Role.Teacher);
    private Instructor d = new Instructor("002", "002", false, "Yeet", "Yeet@hu.nl", "df8gkdf", Role.Teacher);
    private Instructor e = new Instructor("003", null, false, "Meneer", "Meneer@hu.nl", "2lk43jo", Role.Teacher);
    private ArrayList<Instructor> instructors;

    public InstructorRepository() {
        this.instructors = new ArrayList<>();
        instructors.add(c);
        instructors.add(d);
        instructors.add(e);
    }

    public boolean archiveInstructorForCourse(String courseId) {
        for (int i = 0; i < instructors.size(); i++) {
            if (instructors.get(i).getCourseId().equals(courseId)) {
                instructors.get(i).setArchived(true);
                return true;
            }
        }
        return false;
    }

    public Instructor updateCourseForInstructor(String googleId, String newCourseId) {
        archiveInstructorForCourse(newCourseId);
        for (Instructor i : instructors) {
            if (i.getGoogleId().equals(googleId)) {
                i.setCourseId(newCourseId);
                return i;
            }
        }
        return null;
    }

}
