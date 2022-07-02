package org.hillel.homeworks.lesson3;

public class App {
    public static void main(String[] args) {

        MyLinkedList MyLinkedList = new MyLinkedList();

        MyLinkedList.getFirst();

        System.out.println(MyLinkedList.isEmpty());

        MyLinkedList.add(5);
        MyLinkedList.add(10);
        MyLinkedList.add(15);
        MyLinkedList.add(20);
        MyLinkedList.add(25);

        MyLinkedList.addFirst(7);
        MyLinkedList.addLast(7);

        MyLinkedList.removeFirst();
        MyLinkedList.removeLast();


        for (int i = 0; i < MyLinkedList.size; i++) {
            System.out.print(MyLinkedList.get(i) + " ");
        }
        System.out.println("\n");

        System.out.println(MyLinkedList.isEmpty());

        System.out.println(MyLinkedList.getLast());

        System.out.println(MyLinkedList.size());

        System.out.println(MyLinkedList.get(0));

        MyLinkedList.remove(3);

        for (int i = 0; i < MyLinkedList.size; i++) {
            System.out.print(MyLinkedList.get(i) + " ");
        }
        System.out.println("\n");

        MyLinkedList.clear();
        System.out.println(MyLinkedList);

    }
}
