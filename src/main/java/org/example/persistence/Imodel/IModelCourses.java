package org.example.persistence.Imodel;

import org.example.entitiy.CoursesEntity;
import org.example.persistence.CRUD.Create;
import org.example.persistence.CRUD.Delete;
import org.example.persistence.CRUD.Read;
import org.example.persistence.CRUD.Update;

public interface IModelCourses extends Create<CoursesEntity>, Update<CoursesEntity>, Read<CoursesEntity>, Delete<CoursesEntity> {
}
