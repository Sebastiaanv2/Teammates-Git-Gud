package Teammates.git.gud.models;

import java.util.Date;

public class Course {
    private String Id;
    private String Name;
    private Date CreatedAt;
    private Date DeletedAt;

    public Course(String id, String name, Date createdAt, Date deletedAt) {

        Id = id;
        Name = name;
        CreatedAt = createdAt;
        DeletedAt = deletedAt;
    }

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

    public String toString() {
        return "Course Name: " + getName();
    }

}
