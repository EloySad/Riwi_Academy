package org.example.entitiy;

public class CoursesEntity {

    private int id;
    private String name;
    private String students_quantity;

    public CoursesEntity() {
    }

    public CoursesEntity(int id, String students_quantity, String name) {
        this.id = id;
        this.students_quantity = students_quantity;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudents_quantity() {
        return students_quantity;
    }

    public void setStudents_quantity(String students_quantity) {
        this.students_quantity = students_quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CoursesEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students_quantity='" + students_quantity + '\'' +
                '}';
    }
}
