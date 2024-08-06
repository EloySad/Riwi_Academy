package org.example.persistence.Imodel;

import org.example.entitiy.StudentsEntity;
import org.example.persistence.CRUD.Create;
import org.example.persistence.CRUD.Delete;
import org.example.persistence.CRUD.Read;
import org.example.persistence.CRUD.Update;

import java.util.List;

public interface IModelStudents extends Create<StudentsEntity>, Update<StudentsEntity>, Read<StudentsEntity>, Delete<StudentsEntity>{
    List<StudentsEntity> read();

    void delete(Integer id);
}
