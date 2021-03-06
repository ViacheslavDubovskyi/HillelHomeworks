package org.hillel.homeworks.lesson3;

import java.util.*;

public class MyLinkedList implements List<Integer>, Deque<Integer> {

    public int size = 0;
    public Node first;
    public Node last;

    public static class Node {
        Integer item;
        Node next;
        Node prev;

        public Node(Integer element) {
            this.item = element;
        }
    }

    public void add(int element) {
        if (size != 0) {
            Node newMode = new Node(element);
            last.next = newMode;
            newMode.prev = last;
            last = newMode;
        } else {
            last = new Node(element);
            first = last;
        }
        size++;
    }

    @Override
    public Integer get(int index) {
        Node current = first;
        Integer object = null;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                object = current.item;
                break;
            } else {
                current = current.next;
            }
        }
        return object;
    }

    @Override
    public Integer remove(int index) {
        Node current = first;
        if (index == 0) {
            first = current.next;
        } else if (size == index + 1) {
            current = last;
            last = current.prev;
        } else {
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
        return index;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
        first = null;
        last = null;
    }

    @Override
    public Integer getFirst() {
        if (isEmpty()) {
            System.out.println("The LinkedList is empty!");
        }
        return get(0);
    }

    @Override
    public Integer getLast() {
        if (isEmpty()) {
            System.out.println("The LinkedList is empty!");
        }
        return get(size - 1);
    }

    @Override
    public void addFirst(Integer integer) {
        Node newNode = new Node(integer);
        first.prev = newNode;
        newNode.next = first;
        first = newNode;
        size++;
    }

    @Override
    public void addLast(Integer integer) {
        Node newNode = new Node(integer);
        if (isEmpty())
            first = newNode;
        else {
            last.next = newNode;
            newNode.prev = last;
        }
        last = newNode;
        size++;
    }

    @Override
    public Integer removeFirst() {
        int temp = first.item;
        if (first.next == null)
            last = null;
        else
            first = first.next;
        size--;
        return temp;
    }


    @Override
    public Integer removeLast() {
        int temp = last.item;
        if (last.prev == null)
            last = null;
        else
            last = last.prev;
        size--;
        return temp;
    }

    @Override
    public void add(int index, Integer element) {
    }

    @Override
    public boolean offerFirst(Integer integer) {
        return false;
    }

    @Override
    public boolean offerLast(Integer integer) {
        return false;
    }

    @Override
    public Integer pollFirst() {
        return null;
    }

    @Override
    public Integer pollLast() {
        return null;
    }

    @Override
    public Integer peekFirst() {
        return null;
    }

    @Override
    public Integer peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean offer(Integer integer) {
        return false;
    }

    @Override
    public Integer remove() {
        return null;
    }

    @Override
    public Integer poll() {
        return null;
    }

    @Override
    public Integer element() {
        return null;
    }

    @Override
    public Integer peek() {
        return null;
    }

    @Override
    public void push(Integer integer) {

    }

    @Override
    public Integer pop() {
        return null;
    }

    @Override
    public Iterator<Integer> descendingIterator() {
        return null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Integer integer) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public Integer set(int index, Integer element) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return null;
    }
}