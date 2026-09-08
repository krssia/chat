package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class ArrayList<E> implements List<E> {

    private Object[] elementData = new Object[10];

    private int size;

    @Override
    public void add(E element) {
        if (size == elementData.length) {
            resize();
        }
        elementData[size] = element;
        size++;
    }

    private void resize() {
        int newCapacity = elementData.length + (elementData.length >> 1);
        Object[] newElementData = new Object[newCapacity];
        System.arraycopy(elementData, 0, newElementData, 0, elementData.length);
        this.elementData = newElementData;
    }

    @Override
    public void add(E element, int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (size == elementData.length) {
            resize();
        }
        //TODO 12345 120345
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        size++;
    }

    @Override
    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        E removeElement = (E)elementData[index];
        System.arraycopy(elementData, index + 1 , elementData, index, size - index - 1);
        elementData[size] = null;
        size--;
        //TODO 12345 1245null
        return removeElement;
    }

    @Override
    public boolean remove(E element) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(element, elementData[i])) {
                remove(i);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public E set(int index, E element) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        E oldvalue = (E) elementData[index];
        elementData[index] = element;
        return oldvalue;
    }

    @Override
    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elementData[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayListIterator();
    }

    class ArrayListIterator implements Iterator<E> {

        int cursor;

        @Override
        public boolean hasNext() {
            return cursor != size;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E element = (E) elementData[cursor];
            cursor++;
            return element;
        }
    }
}
