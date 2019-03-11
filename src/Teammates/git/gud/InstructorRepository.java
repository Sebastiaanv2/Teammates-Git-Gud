package Teammates.git.gud;

import java.util.ArrayList;

public class InstructorRepository {
    private Instructor c = new Instructor("001", "001", false, "Gert", "Gert@hu.nl", "a3em6jd", Role.Teacher);
    private Instructor d = new Instructor("002", "002", false, "Yeet", "Yeet@hu.nl", "df8gkdf", Role.Teacher);
    private Instructor e = new Instructor("003", null, false, "Meneer", "Meneer@hu.nl", "2lk43jo", Role.Teacher);
    private ArrayList<Instructor> courseInstructors = new ArrayList<>();

    public boolean updateCourseOfInstructor(String courseId) {
        courseInstructors.add(c);
        courseInstructors.add(d);
        courseInstructors.add(e);
        for (int i = 0; i < courseInstructors.size(); i++) {
            if (courseInstructors.get(i).getCourseId().equals(courseId)) {
                courseInstructors.get(i).setCourseId(courseId);
                return true;
            }
        }
        return false;
    }

    public Instructor findInstructorById(String googleId) {
        courseInstructors.add(c);
        courseInstructors.add(d);
        courseInstructors.add(e);
        for (int i = 0; i < courseInstructors.size(); i++) {
            if (courseInstructors.get(i).getGoogleId().equals(googleId)) {
                return courseInstructors.get(i);
            }
        }
        return null;
    }
}
