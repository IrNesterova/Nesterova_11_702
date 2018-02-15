package ru.itis;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToBegin(123);
        list.addToBegin(124);
        list.addToBegin(125);
        list.addToBegin(126);
        list.add(505);
        list.add(404);
        list.add(127);
        list.remove(126);
        list.contains(505);
        list.printList();
        list.reverse();
        list.printList();

    }
}
