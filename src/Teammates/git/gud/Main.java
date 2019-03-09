package Teammates.git.gud;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        StudentRESTService service = new StudentRESTService();
        System.out.println(service.getCoursesOfStudent("001"));
    }
}
