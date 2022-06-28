package org.hillel.homeworks.lesson2;

import java.util.*;

public class MyArrayList implements List<Integer> {

    int size;
    int[] arrayList;

    //Constructor of the class MyArrayList
    public MyArrayList(int size) {
        this.size = size;
        this.arrayList = initArray(size);
    }

    //The initial array
    public int[] initArray(int size) {
        int[] arrayList = new int[size];
        for (int i = 0; i < size - 1; i++) {
            arrayList[i] = 0;
        }
        return arrayList;
    }

    //Filling the array with random value
    public void fillArrayWithRandomDigits(int bound) {
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = new Random().nextInt(bound);
        }
    }

    @Override
    public int size() {
        return this.arrayList.length;
    }

    @Override
    public Integer get(int index) {
        return this.arrayList[index];
    }

    @Override
    public void clear() {
        Arrays.fill(arrayList, 0);
    }

    @Override
    public Integer set(int index, Integer element) {
        arrayList[index] = element;
        return element;
    }

    @Override
    public Integer remove(int index) {
        int[] newArray = new int[arrayList.length - 1];
        for (int i = 0; i < newArray.length - 1; i++) {
            if (i == index) {
                newArray[index] = arrayList[i + 1];
                for (i = index; i < size; i++) {
                    newArray[i - 1] = arrayList[i];
                }
                break;
            }
            newArray[i] = arrayList[i];
        }
        arrayList = newArray;
        size--;
        return index;
    }

    public void removeByValue(int value) {
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] == value) {
                remove(i + 1);
            }
        }
    }

    @Override
    public boolean isEmpty() {
        boolean result = true;
        for (int i = 0; i < size; i++) {
            if (arrayList[i] != 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    @Override
    public void add(int index, Integer element) {
        int newSize = arrayList.length + 1;
        int[] newArray = new int[newSize];
        for (int i = 0; i < size; i++) {
            if (i == index) {
                newArray[i] = element;
                for (i = index; i < size; i++) {
                    newArray[i + 1] = arrayList[i];
                }
                break;
            }
            newArray[i] = arrayList[i];
        }
        arrayList = newArray;
        size++;
    }

    public void add(int element) {
        int[] newArray = new int[arrayList.length + 1];
        newArray[arrayList.length] = element;
        System.arraycopy(arrayList, 0, newArray, 0, arrayList.length);
        arrayList = newArray;
        size++;
    }

    @Override
    public boolean add(Integer integer) {
        return false;
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