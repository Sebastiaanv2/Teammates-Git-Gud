package Teammates.git.gud;

import java.util.ArrayList;
import java.util.Date;

public class CourseRepository {
    private Course c = new Course("001", "ASD", new Date(), new Date());
    private Course d = new Course("002", "ISE", new Date(), new Date());
    private Course e = new Course("003", "SEP", new Date(), new Date());
    ArrayList<Course> courses;

    public CourseRepository() {
        this.courses = new ArrayList<>();
        courses.add(c);
        courses.add(d);
        courses.add(e);
    }

    public Course getCourse(String courseId) {
        for (Course course : courses) {
            if (course.getId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }
}
