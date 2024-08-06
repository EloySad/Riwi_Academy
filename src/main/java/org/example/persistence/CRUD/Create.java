package org.example.persistence.CRUD;

import org.example.entitiy.StudentsEntity;

public interface Create <T> {

    public StudentsEntity create(T objeto);
}
