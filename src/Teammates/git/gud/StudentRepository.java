package Teammates.git.gud;

import java.util.ArrayList;
import java.util.Date;

public class StudentRepository {
    public Student findStudentById(String googleId) {
        ArrayList<String> courses = new ArrayList<String>();
        courses.add("001");
        courses.add("002");
        return new Student(googleId, "thomas@haribo.nl", "thomas", "teammates", courses);
    }
}
