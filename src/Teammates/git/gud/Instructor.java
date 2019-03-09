package Teammates.git.gud;

public class Instructor {
    private String GoogleId;
    private String CourseId;
    private boolean IsArchived;
    private String Name;
    private String Email;
    private String RegistrationKey;
    private String Role;

    public Instructor( String googleId, String courseId, boolean isArchived, String name, String email, String registrationKey, String role) {
        GoogleId = googleId;
        CourseId = courseId;
        IsArchived = isArchived;
        Name = name;
        Email = email;
        RegistrationKey = registrationKey;
        Role = role;
    }

    public String getGoogleId() {
        return GoogleId;
    }

    public void setGoogleId(String googleId) {
        GoogleId = googleId;
    }

    public String getCourseId() {
        return CourseId;
    }

    public void setCourseId(String courseId) {
        CourseId = courseId;
    }

    public boolean isArchived() {
        return IsArchived;
    }

    public void setArchived(boolean archived) {
        IsArchived = archived;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getRegistrationKey() {
        return RegistrationKey;
    }

    public void setRegistrationKey(String registrationKey) {
        RegistrationKey = registrationKey;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String toString() {
        return getName() + " now teaches course: " + getCourseId();
    }
}
