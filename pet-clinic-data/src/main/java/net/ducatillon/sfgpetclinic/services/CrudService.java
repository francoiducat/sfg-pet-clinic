package net.ducatillon.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

  Set<T> finddAll();

  T findById(ID id);

  T save(T object);

  void delete(T object);

  void deleteByID(T object);
}
