package org.example.entitiy;

public class RegistrationsEntity {

    private int id;
    private int students;
    private String email_students;
    private int courses;

    public RegistrationsEntity() {
    }

    public RegistrationsEntity(int id, int students, String email_students, int courses) {
        this.id = id;
        this.students = students;
        this.email_students = email_students;
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public String getEmail_students() {
        return email_students;
    }

    public void setEmail_students(String email_students) {
        this.email_students = email_students;
    }

    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "RegistrationsEntity{" +
                "id=" + id +
                ", students=" + students +
                ", email_students='" + email_students + '\'' +
                ", courses=" + courses +
                '}';
    }
}
