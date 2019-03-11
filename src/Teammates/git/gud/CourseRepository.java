package Teammates.git.gud;

import java.util.ArrayList;
import java.util.Date;

public class CourseRepository {
    public Course findCourseById(String courseId) {
        Course c = new Course("001", "ASD", new Date(), new Date());
        Course d = new Course("002", "ISE", new Date(), new Date());
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(c);
        courses.add(d);
        for (Course course : courses) {
            if (course.getId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }
}
