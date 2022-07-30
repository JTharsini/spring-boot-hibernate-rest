package com.jeya.springboothibernate.springboothibernaterest;

import java.util.ArrayList;
import java.util.List;

public interface Mapper<T, E>
{
  default List<E> toEntities(List<T> dataObjects)
  {
    List<E> entities = new ArrayList<>();
    for (T dataObject : dataObjects)
    {
      entities.add(toEntity(dataObject));
    }
    return entities;
  }

  default List<T> toDataObjects(List<E> entities)
  {
    List<T> dataObjects = new ArrayList<>();
    for (E entity : entities)
    {
      dataObjects.add(toDataObject(entity));
    }
    return dataObjects;
  }

  E toEntity(T t);

  T toDataObject(E e);
}
