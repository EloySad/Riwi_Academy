package org.example.entitiy;

public class StudentsEntity {

    private int id;
    private int document_id;
    private String name;
    private String last_name;
    private String email;
    private int fk_courses;
    private String status;

    public StudentsEntity() {
    }

    public StudentsEntity(int id, String status, int fk_courses, String email, String last_name, String name, int document_id) {
        this.id = id;
        this.status = status;
        this.fk_courses = fk_courses;
        this.email = email;
        this.last_name = last_name;
        this.name = name;
        this.document_id = document_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDocument_id() {
        return document_id;
    }

    public void setDocument_id(int document_id) {
        this.document_id = document_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFk_courses() {
        return fk_courses;
    }

    public void setFk_courses(int fk_courses) {
        this.fk_courses = fk_courses;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "StudentsEntity{" +
                "id=" + id +
                ", document_id=" + document_id +
                ", name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", fk_courses=" + fk_courses +
                ", status='" + status + '\'' +
                '}';
    }
}
