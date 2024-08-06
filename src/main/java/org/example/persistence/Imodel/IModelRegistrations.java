package org.example.persistence.Imodel;

import org.example.entitiy.RegistrationsEntity;
import org.example.persistence.CRUD.Create;
import org.example.persistence.CRUD.Read;
import org.example.persistence.CRUD.Update;

public interface IModelRegistrations extends Create<RegistrationsEntity>, Update<RegistrationsEntity>, Read<RegistrationsEntity> {
}
