package com.jeya.springboothibernate.springboothibernaterest;

public interface Mapper<T, E>
{
  E toEntity(T t);

  T toDataObject(E e);
}
