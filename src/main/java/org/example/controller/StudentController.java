package org.example.controller;

import org.example.entitiy.StudentsEntity;
import org.example.model.StudentsModelImp;
import org.example.persistence.Imodel.IModelStudents;

public class StudentController {
    IModelStudents studentModel = new StudentsModelImp();

    public StudentController create(int noi, String name, String lastName, String email, int course, String status) {

        return null;
    }
}
