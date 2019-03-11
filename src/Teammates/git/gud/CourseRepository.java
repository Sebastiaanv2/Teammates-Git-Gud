package Teammates.git.gud;

import java.util.ArrayList;
import java.util.Date;

public class CourseRepository {
    public Course findCourseById(String courseId) {
        Course c = new Course("001", "ASD", new Date(), new Date(), "+0800");
        Course d = new Course("002", "ISE", new Date(), new Date(), "-0100");
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(c);
        courses.add(d);
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getId().equals(courseId)) {
                return courses.get(i);
            }
        }
        return null;
    }
}
