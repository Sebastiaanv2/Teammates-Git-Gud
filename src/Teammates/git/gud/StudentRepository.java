package Teammates.git.gud;

import java.util.ArrayList;

public class StudentRepository {
    private ArrayList<String> courses;

    public StudentRepository() {
        this.courses = new ArrayList<>();
        courses.add("001");
        courses.add("002");
        courses.add("003");
    }


    public Student findStudentById(String googleId) {
        return new Student(googleId, "thomas@haribo.nl", "thomas", "teammates", courses);
    }
}
