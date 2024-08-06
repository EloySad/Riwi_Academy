package org.example.persistence.Imodel;

import org.example.entitiy.GradesEntity;
import org.example.persistence.CRUD.Create;
import org.example.persistence.CRUD.Read;
import org.example.persistence.CRUD.Update;

public interface IModelGrades extends Create<GradesEntity>, Update<GradesEntity>, Read<GradesEntity> {
}
