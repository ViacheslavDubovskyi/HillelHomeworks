package org.hillel.homeworks.lesson3;

public class App {

    MyLinkedList MyLinkedList = new MyLinkedList();

    public void add(int element) {
        System.out.println("Method 'add(element:" + element + ")':");
        MyLinkedList.add(element);
        printLinkedList(MyLinkedList);
    }

    public void addFirst(int element) {
        System.out.println("MyLinkedList with method 'addFirst(element:" + element + ")':");
        MyLinkedList.addFirst(element);
        printLinkedList(MyLinkedList);
    }

    public void addLast(int element) {
        System.out.println("MyLinkedList with method 'addLast(element:" + element + ")':");
        MyLinkedList.addLast(element);
        printLinkedList(MyLinkedList);
    }

    public void removeFirst() {
        System.out.println("MyLinkedList with method 'removeFirst()': ");
        MyLinkedList.removeFirst();
        printLinkedList(MyLinkedList);
    }

    public void removeLast() {
        System.out.println("MyLinkedList with method 'removeLast()': ");
        MyLinkedList.removeLast();
        printLinkedList(MyLinkedList);
    }

    public void getFirst() {
        System.out.println("First element of MyLinkedList: " + MyLinkedList.getFirst());
    }

    public void getLast() {
        System.out.println("Last element of MyLinkedList: " + MyLinkedList.getLast());
    }

    public void size() {
        System.out.println("Size of MyLinkedList ('method (size)'): " + MyLinkedList.size());
        System.out.println();
    }

    public void remove(int index) {
        System.out.println("MyLinkedList with method 'remove(index:" + index + ")':");
        MyLinkedList.remove(index);
        printLinkedList(MyLinkedList);
    }

    public void get(int index) {
        System.out.println();
        System.out.println("Method 'get(index:" + index + ")': " + MyLinkedList.get(index));
        System.out.println();
    }

    public void isEmpty() {
        System.out.println("Method 'isEmpty()': " + MyLinkedList.isEmpty());
    }

    public void clear() {
        System.out.println("MyLinkedList with method 'clear()':");
        MyLinkedList.clear();
        printLinkedList(MyLinkedList);
        isEmpty();
    }

    public static void printLinkedList(MyLinkedList MyLinkedList) {
        System.out.print("[ ");
        for (int i = 0; i < MyLinkedList.size; i++) {
            System.out.print("{" + MyLinkedList.get(i) + "} ");
        }
        System.out.print("]\n");
        System.out.println();
    }
}
