package Teammates.git.gud;

import java.util.ArrayList;

public class Student {
    private String GoogleId;
    private String Email;
    private String Name;
    private String TeamName;
    private ArrayList<String> CourseIds;

    public Student(String googleId, String email, String name, String teamName, ArrayList<String> courses) {
        GoogleId = googleId;
        Email = email;
        Name = name;
        TeamName = teamName;
        CourseIds = courses;
    }

    public String getGoogleId() {

        return GoogleId;
    }

    public void setGoogleId(String googleId) {
        GoogleId = googleId;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTeamName() {
        return TeamName;
    }

    public void setTeamName(String teamName) {
        TeamName = teamName;
    }

    public ArrayList<String> getCourses() {
        return CourseIds;
    }

    public void setCourses(ArrayList<String> courses) {
        CourseIds = courses;
    }
}
