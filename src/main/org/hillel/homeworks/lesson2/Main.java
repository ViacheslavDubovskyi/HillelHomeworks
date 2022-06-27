package org.hillel.homeworks.lesson2;

public class Main {

    MyArrayList ArrayList = new MyArrayList(10);

    public void size() {
        System.out.println("Size of ArrayList ('method (size)'): " + ArrayList.size());
        System.out.println();
    }

    public void fillArray(int bound) {
        System.out.println("Filling ArrayList with random int values (bound=" + bound + "):");
        ArrayList.fillArrayWithRandomDigits(bound);
        printArrayList(ArrayList);
    }

    public void add(int index, int element) {
        System.out.println("ArrayList with method 'add(index:" + index + ", element:" + element + ")':");
        ArrayList.add(index, element);
        printArrayList(ArrayList);
    }

    public void set(int index, int element) {
        System.out.println("ArrayList with method 'set(index:" + index + ", value:" + element + ")':");
        ArrayList.set(index, element);
        printArrayList(ArrayList);
    }

    public void remove(int index) {
        System.out.println("ArrayList with method 'remove(index:" + index + ")':");
        ArrayList.remove(index);
        printArrayList(ArrayList);
    }

    public void isEmpty() {
        System.out.println("Method 'isEmpty()': " + ArrayList.isEmpty());
    }

    public void get(int index) {
        System.out.println();
        System.out.println("Method 'get(index:" + index + ")': " + ArrayList.get(index));
        System.out.println();
    }

    public void add(Integer element) {
        System.out.println("Method 'add(element:" + element + ")':" + ArrayList.add(element));
        printArrayList(ArrayList);
    }

    public void clear() {
        System.out.println("ArrayList with method 'clear()':");
        ArrayList.clear();
        printArrayList(ArrayList);
        isEmpty();
    }

    //Printing ArrayList
    public static void printArrayList(MyArrayList ArrayList) {
        System.out.print("[ ");
        for (int i = 0; i < ArrayList.size; i++) {
            System.out.print("{" + ArrayList.get(i) + "} ");
        }
        System.out.print("]\n");
        System.out.println();
    }

    public void initArray() {
        System.out.println("Initial ArrayList:");
        printArrayList(ArrayList);
    }
}
