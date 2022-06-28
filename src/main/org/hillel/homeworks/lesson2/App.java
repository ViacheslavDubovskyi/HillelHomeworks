package org.hillel.homeworks.lesson2;

public class App {

    MyArrayList ArrayList = new MyArrayList(10);

    //Method shows size of the list
    public void size() {
        System.out.println("Size of ArrayList ('method (size)'): " + ArrayList.size());
        System.out.println();
    }

    //Method fills the array with random element
    public void fillArray(int bound) {
        System.out.println("Filling ArrayList with random int values (bound=" + bound + "):");
        ArrayList.fillArrayWithRandomDigits(bound);
        printArrayList(ArrayList);
    }

    //Method adds element at some index, other
    //elements go right from this index
    public void add(int index, int element) {
        System.out.println("ArrayList with method 'add(index:" + index + ", element:" + element + ")':");
        ArrayList.add(index, element);
        printArrayList(ArrayList);
    }

    //Method sets element at some index instead of previous
    //element, which was at this position
    public void set(int index, int element) {
        System.out.println("ArrayList with method 'set(index:" + index + ", value:" + element + ")':");
        ArrayList.set(index, element);
        printArrayList(ArrayList);
    }

    //Method removes element by the index,
    //all elements shift one position to the left
    public void remove(int index) {
        System.out.println("ArrayList with method 'remove(index:" + index + ")':");
        ArrayList.remove(index);
        printArrayList(ArrayList);
    }

    //Method checks if the list is empty (with zeroes), return true if it is,
    //and false, if at least there is one element is not zero
    public void isEmpty() {
        System.out.println("Method 'isEmpty()': " + ArrayList.isEmpty());
    }

    //Method gets element from the index
    public void get(int index) {
        System.out.println();
        System.out.println("Method 'get(index:" + index + ")': " + ArrayList.get(index));
        System.out.println();
    }

    //Method adds element at the end of the list, expanding this list
    public void add(int element) {
        System.out.println("Method 'add(element:" + element + ")':");
        ArrayList.add(element);
        printArrayList(ArrayList);
    }

    //Method removes value (all elements with this value) from the list,
    //all elements shift one (or more, if there are some elements) position to the left
    public void removeByValue(int value) {
        System.out.println("Method 'removeByValue(value:" + value + "):");
        ArrayList.removeByValue(value);
        printArrayList(ArrayList);
    }

    //Method clears all the values, to initial array
    public void clear() {
        System.out.println("ArrayList with method 'clear()':");
        ArrayList.clear();
        printArrayList(ArrayList);
        isEmpty();
    }

    //Method initializes ArrayList (elements are zeroes)
    public void initArray() {
        System.out.println("Initial ArrayList:");
        printArrayList(ArrayList);
    }

    //Method prints ArrayList
    public static void printArrayList(MyArrayList ArrayList) {
        System.out.print("[ ");
        for (int i = 0; i < ArrayList.size; i++) {
            System.out.print("{" + ArrayList.get(i) + "} ");
        }
        System.out.print("]\n");
        System.out.println();
    }
}
