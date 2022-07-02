package org.hillel.homeworks.lesson3;

public class App {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(5);
        myLinkedList.add(10);
        myLinkedList.add(15);


        for (int i = 0; i < myLinkedList.size; i++) {
            System.out.print(myLinkedList.get(i) + " ");
        }
        System.out.println("\n");

        System.out.println(myLinkedList.get(0));

        System.out.println(myLinkedList);

    }

}
