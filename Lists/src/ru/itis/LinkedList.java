package ru.itis;

import java.util.Arrays;

public class LinkedList implements List {
    private int size;
    private static class Node {
        Object value;
        Node next;


        Node(Object value) {
            this.value = value;
        }
    }
    // ссылка на первый элемент списка
    private Node head;
    // ссылка на последний элемент списка
    private Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public Object get(int index) {
        int currentIndex = 0;
        Node temp = head;

        while (temp!=null){
            if (currentIndex == index){
                return temp.value;
            } else {
                temp = temp.next;
                currentIndex++;
            }
        }
        throw new IllegalArgumentException();
    }

    @Override
    public void addToBegin(Object object) {
        Node newNode = new Node(object);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    @Override
    public void add(Object element) {
        Node newNode = new Node(element);
        tail.next = newNode;
        tail = newNode;
    }

    @Override
    public void remove(Object element) {
        Node temp = head;
        Node ptr = temp.next;
        while (head.value==element){
            head = head.next;
        }
        while (ptr !=null){
            if (ptr.value == element){
                Node next = ptr.next;
                temp.next = next;
                ptr = next;
            } else {
                temp = ptr;
                ptr = ptr.next;
            }
        }
    }

    public void printList(){
        Node node = head;
        while (node !=null){
            System.out.println(node.value + " ");
            node = node.next;
        }
    }

    @Override
    public boolean contains(Object element) {
        Node temp = head;
        while (temp.next !=null){
            if (temp.value.equals(element)){
                return true;
            } else {
                temp = temp.next;
            }
        }
        throw new IllegalArgumentException();
    }

    public void reverse() {
        Node temp = head;
        Node prev = null;
        while (temp !=null){
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;
    }

    static LinkedList merge(LinkedList a, LinkedList b){
        return null;
    }
}
