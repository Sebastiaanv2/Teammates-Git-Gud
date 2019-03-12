package Teammates.git.gud;

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


    public Instructor updateCourseOfInstructor(String googleId, String newCourseId) {
        for (Instructor i : instructors) {
            if (i.getGoogleId().equals(googleId)) {
                i.setCourseId(newCourseId);
                return i;
            }
        }
        return null;
    }

    public Instructor findInstructorById(String googleId) {
        for (Instructor i : instructors) {
            if (i.getGoogleId().equals(googleId)) {
                return i;
            }
        }
        return null;
    }
}
