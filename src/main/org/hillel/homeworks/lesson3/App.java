package org.hillel.homeworks.lesson3;

public class App {

    MyLinkedList MyLinkedList = new MyLinkedList();

    //Method adds element at the end of the list, expanding this list
    public void add(int element) {
        System.out.println("Method 'add(element:" + element + ")':");
        MyLinkedList.add(element);
        printLinkedList(MyLinkedList);
    }

    //Method adds element at the first position of the list, expanding this list
    public void addFirst(int element) {
        System.out.println("MyLinkedList with method 'addFirst(element:" + element + ")':");
        MyLinkedList.addFirst(element);
        printLinkedList(MyLinkedList);
    }

    //Method adds element at the first position of the list, expanding this list
    public void addLast(int element) {
        System.out.println("MyLinkedList with method 'addLast(element:" + element + ")':");
        MyLinkedList.addLast(element);
        printLinkedList(MyLinkedList);
    }

    //Method removes first element of the list,
    //all elements shift one position to the left
    public void removeFirst() {
        System.out.println("MyLinkedList with method 'removeFirst()': ");
        MyLinkedList.removeFirst();
        printLinkedList(MyLinkedList);
    }

    //Method removes last element of the list
    public void removeLast() {
        System.out.println("MyLinkedList with method 'removeLast()': ");
        MyLinkedList.removeLast();
        printLinkedList(MyLinkedList);
    }

    //Method gets first element from the list
    public void getFirst() {
        System.out.println("First element of MyLinkedList: " + MyLinkedList.getFirst());
    }

    //Method gets last element from the list
    public void getLast() {
        System.out.println("Last element of MyLinkedList: " + MyLinkedList.getLast());
    }

    //Method shows size of the list
    public void size() {
        System.out.println("Size of MyLinkedList ('method (size)'): " + MyLinkedList.size());
        System.out.println();
    }

    //Method removes element by the index,
    //all elements shift one position to the left
    public void remove(int index) {
        System.out.println("MyLinkedList with method 'remove(index:" + index + ")':");
        MyLinkedList.remove(index);
        printLinkedList(MyLinkedList);
    }

    //Method gets element from the index
    public void get(int index) {
        System.out.println();
        System.out.println("Method 'get(index:" + index + ")': " + MyLinkedList.get(index));
        System.out.println();
    }

    //Method checks if the list is empty, return true if it is,
    //and false, if there are no elements
    public void isEmpty() {
        System.out.println("Method 'isEmpty()': " + MyLinkedList.isEmpty());
    }

    //Method clears the list, it deletes all elements
    public void clear() {
        System.out.println("MyLinkedList with method 'clear()':");
        MyLinkedList.clear();
        printLinkedList(MyLinkedList);
        isEmpty();
    }

    //Method prints MyLinkedList
    public static void printLinkedList(MyLinkedList MyLinkedList) {
        System.out.print("[ ");
        for (int i = 0; i < MyLinkedList.size; i++) {
            System.out.print("{" + MyLinkedList.get(i) + "} ");
        }
        System.out.print("]\n");
        System.out.println();
    }
}
