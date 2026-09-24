package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class LinkedList<E> implements List<E> {

    private Node head;
    private Node tail;
    private int size;

    @Override
    public void add(E element) {
        Node node = new Node(tail, element, null);
        if (tail == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    @Override
    public void add(E element, int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (Objects.equals(index, size)) {
            add(element);
            return;
        }

        Node indexNode = findNode(index);
        if (indexNode.pre == null) {
            Node node = new Node(null, element, indexNode);
            indexNode.pre = node;
            head = node;
        } else {
            Node node = new Node(indexNode.pre, element, indexNode);
            indexNode.pre.next = node;
            indexNode.pre = node;
        }
        size++;
    }

    private Node findNode(int index) {
        Node node;
        if (index <= size / 2) {
            node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = tail;
            for (int i = size - 1; i > index; i--) {
                node = node.pre;
            }
        }
        return node;
    }


    @Override
    public E removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node node = findNode(index);
        return removeNode(node);
    }

    private E removeNode(Node node) {
        E value = node.getValue();

        if (node.pre != null) {
            node.pre.next = node.next;
        } else {
            head = node.next;
        }

        if (node.next != null) {
            node.next.pre = node.pre;
        } else {
            tail = node.pre;
        }

        node.pre = null;
        node.next = null;
        size--;
        return value;
    }

    @Override
    public boolean remove(E element) {
        Node node = head;
        for (int i = 0; i < size; i++) {
            if (Objects.equals(element, node.getValue())) {
                removeNode(node);
                return true;
            }
            node = node.next;
        }
        return false;
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node node = findNode(index);
        E oldValue = node.getValue();
        node.setValue(element);
        return oldValue;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node node = findNode(index);
        return node.getValue();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    class LinkedListIterator implements Iterator<E> {

        Node node = head;

        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E value = node.getValue();
            node = node.next;
            return value;
        }
    }

    class Node {
        Node pre;
        E value;
        Node next;

        Node(Node pre, E value, Node next) {
            this.pre = pre;
            this.value = value;
            this.next = next;
        }

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }
    }
}
