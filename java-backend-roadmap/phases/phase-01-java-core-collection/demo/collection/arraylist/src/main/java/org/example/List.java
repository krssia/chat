package org.example;

public interface List<E> extends Iterable<E> {

    void add(E element);

    void add(E element, int index);

    E removeAt(int index);

    boolean remove(E element);

    E set(int index, E element);

    E get(int index);

    int size();
}
