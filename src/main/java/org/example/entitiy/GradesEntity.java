package org.example.entitiy;

public class GradesEntity {

    private int id;
    private int students;
    private int courses;
    private double grades;
    private String description;

    public GradesEntity() {
    }

    public GradesEntity(int id, int students, int courses, double grades, String description) {
        this.id = id;
        this.students = students;
        this.courses = courses;
        this.grades = grades;
        this.description = description;
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

    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "GradesEntity{" +
                "id=" + id +
                ", students=" + students +
                ", courses=" + courses +
                ", grades=" + grades +
                ", description='" + description + '\'' +
                '}';
    }
}
