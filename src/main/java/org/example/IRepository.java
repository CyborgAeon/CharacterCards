package org.example;

public interface IRepository<T, ID> {
    T create(T node);

    T readById(ID id);

    T update(T node);

    boolean delete(T node);
}

