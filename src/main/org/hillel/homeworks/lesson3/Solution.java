package org.hillel.homeworks.lesson3;

public class Solution {

    public static void main(String[] args) {
        App app = new App();

        app.isEmpty();
        app.add(5);
        app.add(10);
        app.add(15);
        app.add(20);
        app.add(25);
        app.isEmpty();
        app.get(2);
        app.addFirst(7);
        app.removeLast();
        app.removeFirst();
        app.addLast(100);
        app.getFirst();
        app.getLast();
        app.size();
        app.remove(2);
        app.clear();
    }
}
