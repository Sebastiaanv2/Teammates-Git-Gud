package Teammates.git.gud;

import java.util.Date;

public class Course {
    private String Id;
    private String Name;
    private Date CreatedAt;
    private Date DeletedAt;
    private String TimeZone;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(Date createdAt) {
        CreatedAt = createdAt;
    }

    public Date getDeletedAt() {
        return DeletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        DeletedAt = deletedAt;
    }

    public String getTimeZone() {
        return TimeZone;
    }

    public void setTimeZone(String timeZone) {
        TimeZone = timeZone;
    }

    public Course(String id, String name, Date createdAt, Date deletedAt, String timeZone) {

        Id = id;
        Name = name;
        CreatedAt = createdAt;
        DeletedAt = deletedAt;
        TimeZone = timeZone;
    }
}
